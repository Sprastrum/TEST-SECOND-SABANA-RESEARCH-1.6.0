package entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DocumentedActivity extends Activity {

    private NormalActivity activity;
    private List<Question> questions;

    public DocumentedActivity(String name, String state, Iteration iteration, NormalActivity activity) {
        super(name, state, iteration);
        this.activity = activity;
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    @Override
    public Duration getDuration() throws SabanaResearchException {
        long sec = 0;

        if(activity == null) {
            throw new SabanaResearchException(SabanaResearchException.BAD_FORMED_DOCUMENTED_ACTIVITY_WITHOUT_NORMAL_QUESTION);
        }
        for(Step s : activity.getSteps()) {
            if(s.getDuration() != null) {
                sec += s.getDuration().toSeconds();
            }
        }

        for(Question q : questions) {
            if(q.getDedication() != null) {
                sec += q.getDedication().toSeconds();
            }
        }

        return Duration.ofSeconds(sec);
    }
}

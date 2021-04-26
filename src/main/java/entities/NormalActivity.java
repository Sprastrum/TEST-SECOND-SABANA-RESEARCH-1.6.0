package entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class NormalActivity extends Activity {

    private List<Step> steps;

    public NormalActivity(String name, String state, Iteration iteration) {
        super(name, state, iteration);
        this.steps = new ArrayList<>();
    }

    public void addStep(Step step) {
        this.steps.add(step);
    }

    /**
     * Return all steps
     *
     * @return List
     */
    public List<Step> getSteps() {
        return steps;
    }

    /**
     * Return the duration of all steps
     *
     * @return Duration
     * @throws SabanaResearchException
     */
    @Override
    public Duration getDuration() throws SabanaResearchException {
        long days = 0;

        if(steps.size() <= 0) {
            throw new SabanaResearchException(SabanaResearchException.BAD_FORMED_NORMAL_ACTIVITY);
        }
        for(Step s : steps) {
            days += s.getDuration().toSeconds();
        }

        return Duration.ofSeconds(days);
    }

    @Override
    public boolean isActive() {
        boolean result = false;

        if(getState().equals(ACTIVE_STATE) || getState().equals(PENDING_STATE)) {
            result = true;
        }

        return result;
    }
}

package entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ExecuteSynthesizer implements ISynthesizer {

    private List<String> synthesizer = new ArrayList<>();

    @Override
    public List<String> synthesizer(List<Student> students, List<Iteration> iterations) {
        String d = null;

        for(Iteration i : iterations) {
            try {
                synthesizer.add(i.getGoal() + " - " + i.getDuration());
            } catch (SabanaResearchException e) {
                synthesizer.add(i.getGoal() + " - " + d);
            }
            synthesizer.add(i.getGoal() + " - " + d);
        }

        return synthesizer;
    }
}

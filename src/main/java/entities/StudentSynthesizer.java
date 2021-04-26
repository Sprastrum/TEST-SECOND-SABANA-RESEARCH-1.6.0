package entities;

import java.util.ArrayList;
import java.util.List;

public class StudentSynthesizer implements ISynthesizer {

    private List<String> synthesizer = new ArrayList<>();

    @Override
    public String synthesizer(List<Student> students, List<Iteration> iterations) {

        for(Student s : students) {
            synthesizer.add(s.getCompleteName() + " - " + s.getDuration());
        }

        return synthesizer;
    }
}

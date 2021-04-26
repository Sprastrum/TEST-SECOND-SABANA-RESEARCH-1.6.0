package entities;

import java.time.Duration;
import java.util.List;

public interface ISynthesizer {
    String synthesizer(List<Student> students, List<Iteration> iterations);
}

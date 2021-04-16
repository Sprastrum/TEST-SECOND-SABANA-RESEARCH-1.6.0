package entities;

import java.time.Duration;

public class Step {

    private String objective;
    private Duration duration;

    public Step(String objective, Duration duration) {
        this.objective = objective;
        this.duration = duration;
    }

}

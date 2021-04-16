package entities;

import java.time.Duration;

public class Question {

    public static final String HARD_QUESTION = "HARD";
    public static final String EASY_QUESTION = "EASY";

    private String difficulty;
    private String description;
    private Duration dedication;

    public Question(String difficulty, String description, Duration dedication) {
        this.difficulty = difficulty;
        this.description = description;
        this.dedication = dedication;
    }
}

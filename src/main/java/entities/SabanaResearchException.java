package entities;

public class SabanaResearchException extends Exception {

    public static final String BAD_FORMED_PROJECT = "The project is bad formed, it hasn't iterations.";
    public static final String BAD_FORMED_ITERATION = "The iteration is bad formed, it hasn't activities.";
    public static final String BAD_FORMED_NORMAL_ACTIVITY = "The normal activity is bad formed, it hasn't steps.";
    public static final String BAD_FORMED_DOCUMENTED_ACTIVITY = "The documented activity is bad formed, it hasn't questions.";
    public static final String BAD_FORMED_DOCUMENTED_ACTIVITY_WITHOUT_NORMAL_QUESTION = "The documented activity is bad formed, it hasn't normal activity associated.";

    public SabanaResearchException(String message) {
        super(message);
    }
}

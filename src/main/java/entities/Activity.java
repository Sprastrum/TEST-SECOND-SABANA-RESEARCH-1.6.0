package entities;

import java.time.Duration;

public abstract class Activity {

    public static final String ACTIVE_STATE = "active";
    public static final String CLOSED_STATE = "closed";
    public static final String PENDING_STATE = "pending";
    public static final String CANCELED_STATE = "canceled";

    private String name;
    private String state;
    private Iteration iteration;

    public Activity(String name, String state, Iteration iteration) {
        this.name = name;
        this.state = state;

        if (iteration != null) {
            this.iteration = iteration;
            this.iteration.addActivity(this);
        }
    }

    public String getState() {
        return state;
    }

    /**
     * Evaluate if an activity is active.
     *
     * @return true if the activity is in state pending or active, otherwise return false.
     */
    public boolean isActive() {
        return false;
    }

    /**
     * Get the duration of the activity.
     *
     * @return
     */
    public abstract Duration getDuration() throws SabanaResearchException;
}

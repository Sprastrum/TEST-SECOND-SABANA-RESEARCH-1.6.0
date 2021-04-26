package entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Iteration {

    private String goal;
    private Project project;
    private List<Activity> activities;

    public Iteration(String goal, Project project) {
        this.goal = goal;
        this.project = project;
        this.activities = new ArrayList<>();

        project.addIteration(this);
    }

    public String getGoal() {
        return goal;
    }

    public void addActivity(Activity activity) {
        this.activities.add(activity);
    }

    /**
     * Return all activities of iteration
     *
     * @return
     */
    public List<Activity> getActivities() {
        return activities;
    }

    /**
     * Return the duration of all activities
     *
     * @return
     * @throws SabanaResearchException
     */
    public Duration getDuration() throws SabanaResearchException {
        long days = 0;

        if(activities.size() <= 0) {
            throw new SabanaResearchException(SabanaResearchException.BAD_FORMED_ITERATION);
        }
        for(Activity a : activities) {
            if(a.getDuration() != null) {
                days += a.getDuration().toDays();
            }
        }

        return Duration.ofDays(days);
    }

    /**
     * Count one if activity is true.
     *
     * @return number of activities opens or pendings.
     */
    public int countOpenActivities() {
        int open = 0;

        for(Activity a : activities) {
            if(a.isActive()) {
                open++;
            }
        }

        return open;
    }

    /**
     * Count one if activity is true.
     *
     * @return number of activities close or canceled.
     */
    public int countCloseActivities() {
        int close = 0;

        for(Activity a : activities) {
            if(!a.isActive()) {
                close++;
            }
        }

        return close;
    }
}
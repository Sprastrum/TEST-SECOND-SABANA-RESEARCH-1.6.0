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

    public void addActivity(Activity activity) {
        this.activities.add(activity);
    }

    public List<Activity> getActivities() {
        return activities;
    }

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
}

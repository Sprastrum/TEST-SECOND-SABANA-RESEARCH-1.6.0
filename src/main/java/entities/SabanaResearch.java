package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SabanaResearch {

    private List<Group> groups;
    private List<Summary> summaries;

    public SabanaResearch(List<Group> groups) {
        this.groups = groups;
        this.summaries = new ArrayList<>();
    }

    public int countOfGroups() {
        return this.groups.size();
    }

    public int countOfSummaries() {
        return this.summaries.size();
    }

    /**
     * Create a summary entry in the current date.
     * - Calculate the count of active projects.
     *
     * @return The new Summary entry.
     */
    public Summary createSummaryEntry() {
        int ap = 0;

        for(Group g : groups) {
            if(g.countActiveProjects(1) > 0) {
                ap++;
            }
        }

        Summary summary = new Summary(LocalDate.now(), ap);
        return summary;
    }

    public String numberActivitiesOpenOrClose() {
        int open = 0, close = 0;

        for(Group g : groups) {
            open += g.countActiveProjects(2);
            close += g.countActiveProjects(3);
        }

        return "Activities Open: " + open + " - Activities Close: " + close;
    }
}

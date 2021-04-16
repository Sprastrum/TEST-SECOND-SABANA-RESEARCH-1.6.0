package entities;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Project {

    private String name;
    private LocalDate dateInit;
    private LocalDate dateEnd;
    private Group group;
    private List<Iteration> iterations;

    public Project(String name, LocalDate dateInit, LocalDate dateEnd, Group group) {
        this.name = name;
        this.dateInit = dateInit;
        this.dateEnd = dateEnd;
        this.group = group;
        this.iterations = new ArrayList<>();

        group.addProject(this);
    }

    public void addIteration(Iteration iteration) {
        this.iterations.add(iteration);
    }

    /**
     * Return the duration of all project
     *
     * @return Duration
     * @throws SabanaResearchException
     */
    public Duration getDuration() throws SabanaResearchException {
        long days = 0;

        if(iterations.size() <= 0) {
            throw new SabanaResearchException(SabanaResearchException.BAD_FORMED_PROJECT);
        }
        for(Iteration i : iterations) {
            days += i.getDuration().toDays();
        }

        return Duration.ofDays(days);
    }

    public int numberActivities() {
        int n = 0;

        for(Iteration i : iterations) {
            n = i.getActivities().size();
        }

        return n;
    }
}

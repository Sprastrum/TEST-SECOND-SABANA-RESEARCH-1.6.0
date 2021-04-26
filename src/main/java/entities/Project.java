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
    private StudentSynthesizer ss = new StudentSynthesizer();
    private ExecuteSynthesizer es = new ExecuteSynthesizer();
    private List<Student> students;

    public Project(String name, LocalDate dateInit, LocalDate dateEnd, Group group, List<Student> students) {
        this.name = name;
        this.dateInit = dateInit;
        this.dateEnd = dateEnd;
        this.group = group;
        this.iterations = new ArrayList<>();
        this.students = students;

        group.addProject(this);
    }

    public void addIteration(Iteration iteration) {
        this.iterations.add(iteration);
    }

    public void setDateInit(LocalDate dateInit) {
        this.dateInit = dateInit;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
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

    /**
     * Evaluate if a project is active.
     *
     * @return false if the project has not open activities or the dateEnd is before than the system date.
     */
    public boolean isActive() {
        boolean result = false;

        for(Iteration i : iterations) {
            if(i.countOpenActivities() > 0 || dateEnd.isBefore(LocalDate.now())) {
                result = true;
            }
        }

        return result;
    }

    public int countActiveIterations() {
        int ap = 0;

        for(Iteration i : iterations) {
            if(i.countOpenActivities() > 0) {
                ap += i.countOpenActivities();
            }
        }

        return ap;
    }

    public int countCloseActivities() {
        int close = 0;

        for(Iteration i : iterations) {
            if(i.countCloseActivities() > 0) {
                close += i.countCloseActivities();
            }
        }

        return close;
    }

    public String summarize() {
        List<String> s1 = new ArrayList<>();
        List<String> s2 = new ArrayList<>();
        String s = "";
        int i = 0;

        for(i = 0; i < s1.size(); i++) {
            s = s1.get(i) + "\n";
        }
        for(i = 0; i < s2.size(); i++) {
            s = s2.get(i) + "\n";
        }

        return s;
    }
}

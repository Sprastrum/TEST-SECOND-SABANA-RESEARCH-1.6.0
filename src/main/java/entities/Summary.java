package entities;

import java.time.LocalDate;

public class Summary {

    private int activeProjects;
    private LocalDate date;

    Summary(LocalDate currentDate, int ap) {
        this.date = currentDate;
        this.activeProjects = ap;
    }

    public int getActiveProjects() {
        return activeProjects;
    }

    public LocalDate getDate() {
        return date;
    }
}

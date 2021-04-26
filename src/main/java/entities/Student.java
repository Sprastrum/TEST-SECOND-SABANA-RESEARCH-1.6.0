package entities;

import java.time.Duration;

public class Student {

    private String name, lastname;
    private Duration duration;

    public Student(String name, String lastname, Duration duration) {
        this.name = name;
        this.lastname = lastname;
        this.duration = duration;
    }

    public String getCompleteName() {
        return name + " " + lastname;
    }

    public Duration getDuration() {
        return duration;
    }
}

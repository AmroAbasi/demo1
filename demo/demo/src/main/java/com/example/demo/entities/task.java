package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="tasks")
public class task implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String uName;
    String TaskName;

    String objective;

    public task() {
    }

    public task(long id, String uName, String taskName, String objective) {
        this.id = id;
        this.uName = uName;
        TaskName = taskName;
        this.objective = objective;
    }

    public long id() {
        return id;
    }

    public task setId(long id) {
        this.id = id;
        return this;
    }

    public String uName() {
        return uName;
    }

    public task setuName(String uName) {
        this.uName = uName;
        return this;
    }

    public String TaskName() {
        return TaskName;
    }

    public task setTaskName(String taskName) {
        TaskName = taskName;
        return this;
    }

    public String objective() {
        return objective;
    }

    public task setObjective(String objective) {
        this.objective = objective;
        return this;
    }
}

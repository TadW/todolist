package com.todolist.domain;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "task_name")
    private String task_name;

    @Column(name = "task_description")
    private String task_description;

   // @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "taskAdd")
    private String taskAdd;


    public Task() {
    }

    public Task(String task_name, String task_description, String taskAdd) {
        this.task_name = task_name;
        this.task_description = task_description;
        this.taskAdd = taskAdd;
    }

    public Task(String task_name, String task_description) {
        this.task_name = task_name;
        this.task_description = task_description;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getTask_description() {
        return task_description;
    }

    public void setTask_description(String task_description) {
        this.task_description = task_description;
    }

    public String getTaskAdd() {
        return taskAdd;
    }

    public void setTaskAdd(String taskAdd) {
        this.taskAdd = taskAdd;
    }


    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", task_name='" + task_name + '\'' +
                ", task_description='" + task_description + '\'' +
                ", taskAdd=" + taskAdd +
                '}';
    }
}

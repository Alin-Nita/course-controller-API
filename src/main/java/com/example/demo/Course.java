package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String course;
    private String courseStart;
    private int duration ;
    private boolean free;
    private boolean rotationOfTeachers;
    private boolean online;
    private String learningOutcome;



    public Course(String createdBy, String course, String originCountry, Timestamp dateCreated) {
        this.id = id;
        this.course = course;
        this.courseStart = courseStart;
        this.duration = duration;
        this.free = free;
        this.rotationOfTeachers = rotationOfTeachers;
        this.online = online;
        this.learningOutcome = learningOutcome;
    }

    public Course() {

    }

    public int getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }

    public String getCourseStart() {
        return courseStart;
    }

    public int getDuration() {
        return duration;
    }

    public boolean isFree() {
        return free;
    }

    public boolean isRotationOfTeachers() {
        return rotationOfTeachers;
    }

    public boolean isOnline() {
        return online;
    }

    public String getLearningOutcome() {
        return learningOutcome;
    }
}


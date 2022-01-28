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
    private String free;
    private String rotationOfTeachers;
    private String online;
    private String learningOutcome;

    public Course(int id, String course, String courseStart, int duration, String free, String rotationOfTeachers, String online, String learningOutcome) {
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

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourseStart() {
        return courseStart;
    }

    public void setCourseStart(String courseStart) {
        this.courseStart = courseStart;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }

    public String getRotationOfTeachers() {
        return rotationOfTeachers;
    }

    public void setRotationOfTeachers(String rotationOfTeachers) {
        this.rotationOfTeachers = rotationOfTeachers;
    }

    public String getOnline() {
        return online;
    }

    public void setOnline(String online) {
        this.online = online;
    }

    public String getLearningOutcome() {
        return learningOutcome;
    }

    public void setLearningOutcome(String learningOutcome) {
        this.learningOutcome = learningOutcome;
    }
}
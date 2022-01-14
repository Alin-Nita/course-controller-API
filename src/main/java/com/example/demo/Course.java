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
    private String createdBy;
    private String course;
    private String originCountry;
    private int dateCreated;

    public Course() {
        this.dateCreated = 15012022;
    }




    public Course(String createdBy, String course, String originCountry, Timestamp dateCreated) {
        this.id = id;
        this.createdBy = createdBy;
        this.course = course;
        this.originCountry = originCountry;
        this.dateCreated = 7012022;
    }

    public int getId() {
        return id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getCourse() {
        return course;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public int getDateCreated() {
        return dateCreated;
    }
}


package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {
    //where we would write custom methods
    //<ReturnType> [operation]By[attribute](parameter)
    Course findCourseByid(int id);

    String deleteCourseByid(int id);

}


package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
@CrossOrigin(origins  =  "http://localhost:3000")
public class CourseController {
    @Autowired
    CourseRepository repository;

    ArrayList<Course> courses = new ArrayList<>();

//    @GetMapping("/welcome")
//    public String sayHi() {
//        return "Welcome to serverside programming";
//    }
//
//    @GetMapping("/welcome/{name}")
//    public String sayHiByName(@PathVariable String name) {
//        return "Hello" + " "  + name;
//    }
//
//    // welcome?path=true


    @GetMapping("/courses")
    public ResponseEntity<List<Course>> getGreetings() {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());

//                repository.findAll();
    }

    @GetMapping("/course/{id}")
    public ResponseEntity<Course> getCourseById (@PathVariable String id) {
//         List<Course> courses = getCourses();
//         //int number // list called courses
//        return courses.stream()
//                .filter(course -> course.getId() == Integer.parseInt(id))
//                .findFirst()
//                .orElse(null);

        return ResponseEntity.status(HttpStatus.OK).body(repository.findCourseByid(Integer.parseInt(id)));

//                repository.findCourseByid(Integer.parseInt(id));

    }

    @GetMapping("/random")
    public ResponseEntity<Course> getRandomCourse() {
        List<Course> courses = repository.findAll();

        int randomNum = (int) Math.floor(Math.random() * courses.size());
        return ResponseEntity.status(HttpStatus.OK).body(courses.get(randomNum));

//                courses.get(randomNum);
    }




    @PostMapping("/course")
    public ResponseEntity<String> createCourse(@RequestBody Course course) {
        repository.save(course);
        return ResponseEntity.status(HttpStatus.CREATED).body("Course added:" + course.getCourse());
//                "Course added:" + course.getCourse();
    }

    //Delete endpoint

//@DeleteMapping("/course/{course}")
//    public String deleteCourse(@PathVariable Course course) {
//        courses.remove(course);
//        return "Removed" + course;
//}

    @DeleteMapping("/course/{id}")
    @Transactional //it has to wait for the delete to happend in order to give us something back / @update e.g.
    public ResponseEntity<String> deleteCourse(@PathVariable String id) {
        repository.deleteCourseByid(Integer.parseInt(id));
        return ResponseEntity.status(HttpStatus.OK).body("The course with ID" + id + "has been deleted");
    }

}

package com.edu.miu.cs.cs425.studenmgmt.model.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
public class CourseController {

//    @Autowired
//    private CourseImp courseService;
//
//    // Create a new course
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public Course createCourse(@RequestBody Course course) {
//        try {
//            return courseService.saveCourse(course);
//        } catch (exception e) {
//            throw new RuntimeException("Error creating course: " + e.getMessage());
//        }
//    }
//
//    // Retrieve all courses
//    @GetMapping
//    public List<Course> getAllCourses() {
//        return courseService.getAllCourse();
//    }
//
//    // Retrieve a specific course by ID
//    @GetMapping("/{id}")
//    public Course getCourseById(@PathVariable Long id) {
//        return courseService.getCourseById(id);
//    }
//
//    // Update an existing course
//    @PutMapping("/{id}")
//    public Course updateCourse(@PathVariable Long id, @RequestBody Course course) {
//        course.setCourseId(id); // Set the ID for the course to be updated
//        try {
//            return courseService.updateCourse(course, id);
//        } catch (CourseNotFoundException e) {
//            throw new CourseNotFoundException("Cannot update. Course not found with ID: " + id);
//        } catch (exception e) {
//            throw new RuntimeException("Error updating course: " + e.getMessage());
//        }
//    }
//
//    // Delete a course by ID
//    @DeleteMapping("/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deleteCourse(@PathVariable Long id) {
//        try {
//            courseService.deleteById(id);
//        } catch (CourseNotFoundException e) {
//            throw new CourseNotFoundException("Cannot delete. Course not found with ID: " + id);
//        } catch (exception e) {
//            throw new RuntimeException("Error deleting course: " + e.getMessage());
//        }
//    }
}
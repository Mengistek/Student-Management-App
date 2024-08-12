//package com.edu.miu.cs.cs425.studenmgmt.model.Controller;
//
//import com.edu.miu.cs.cs425.studenmgmt.model.model.Classroom;
//import com.edu.miu.cs.cs425.studenmgmt.model.ServiceImp.ClassroomImp;
//import com.edu.miu.cs.cs425.studenmgmt.model.Exception.ClassroomNotFoundException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/classrooms")
//public class ClassroomController {
//
//    @Autowired
//    private ClassroomImp classroomService;
//
//    // Create a new classroom
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public Classroom createClassroom(@RequestBody Classroom classroom) {
//        try {
//            return classroomService.saveClassroom(classroom);
//        } catch (Exception e) {
//            throw new RuntimeException("Error creating classroom: " + e.getMessage());
//        }
//    }
//
//    // Retrieve all classrooms
//    @GetMapping
//    public List<Classroom> getAllClassrooms() {
//        return classroomService.getAllClassroom();
//    }
//
//    // Retrieve a specific classroom by ID
//    @GetMapping("/{id}")
//    public Classroom getClassroomById(@PathVariable Long id) {
//        return classroomService.getClassroomById(id);
//    }
//
//    // Update an existing classroom
//    @PutMapping("/{id}")
//    public Classroom updateClassroom(@PathVariable Long id, @RequestBody Classroom classroom) {
//        classroom.setClassroomId(id); // Ensure the ID is set for update
//        try {
//            return classroomService.updateClassroom(classroom, id);
//        } catch (ClassroomNotFoundException e) {
//            throw new ClassroomNotFoundException("Cannot update. Classroom not found with ID: " + id);
//        } catch (Exception e) {
//            throw new RuntimeException("Error updating classroom: " + e.getMessage());
//        }
//    }
//
//    // Delete a classroom by ID
//    @DeleteMapping("/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deleteClassroom(@PathVariable Long id) {
//        try {
//            classroomService.deleteClassroom(id);
//        } catch (ClassroomNotFoundException e) {
//            throw new ClassroomNotFoundException("Cannot delete. Classroom not found with ID: " + id);
//        } catch (Exception e) {
//            throw new RuntimeException("Error deleting classroom: " + e.getMessage());
//        }
//    }
//}
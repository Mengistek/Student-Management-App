package com.edu.miu.cs.cs425.studenmgmt.model.MySQL;

import com.edu.miu.cs.cs425.studenmgmt.model.Classroom;
import com.edu.miu.cs.cs425.studenmgmt.model.Course;
import com.edu.miu.cs.cs425.studenmgmt.model.Repositories.ClassroomRepository;
import com.edu.miu.cs.cs425.studenmgmt.model.Repositories.CourseRepository;
import com.edu.miu.cs.cs425.studenmgmt.model.Student;
import com.edu.miu.cs.cs425.studenmgmt.model.Transcript;
import com.edu.miu.cs.cs425.studenmgmt.model.studentMgmt.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private ClassroomRepository classroomRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            // Create and save Transcript
            Transcript transcript = new Transcript(1L, "BS Computer Science");

            // Create and save Classroom
            Classroom classroom = new Classroom(1L, "McLaughlin building", "M105");
            classroomRepository.save(classroom);

            // Create and save Courses
            Course course1 = new Course(1L, "CS401", "Modern Programming Practices");
            Course course2 = new Course(2L, "CS402", "Database Systems");
            courseRepository.saveAll(Arrays.asList(course1, course2));

            // Create and save Student
            Student student = new Student(1L, "000-61-0001", "Anna", "Lynn", "Smith", 3.45, dateFormat.parse("2019-01-01"));
            student.setTranscript(transcript);
            student.setClassroom(classroom);
            student.setCourses(Arrays.asList(course1, course2));

            studentRepository.save(student);

        } catch (ParseException e) {
            e.printStackTrace();
            System.err.println("Error parsing date: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}
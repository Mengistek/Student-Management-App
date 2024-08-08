package com.edu.miu.cs.cs425.studenmgmt.model.service;

import com.edu.miu.cs.cs425.studenmgmt.model.model.Course;
import com.edu.miu.cs.cs425.studenmgmt.model.exception.CourseNotFoundException;
import com.edu.miu.cs.cs425.studenmgmt.model.repository.CourseRepository;
import com.edu.miu.cs.cs425.studenmgmt.model.service.ServiceImp.CourseImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements CourseImp {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourse() {
        return courseRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        try {
            courseRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new CourseNotFoundException("Course not found with ID: " + id);
        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("Error deleting course: " + e.getMessage());
        }
    }

    @Override
    public Course updateCourse(Course course, Long id) {
        if (!courseRepository.existsById(id)) {
            throw new CourseNotFoundException("Cannot update. Course not found with ID: " + id);
        }
        course.setCourseId(id);
        try {
            return courseRepository.save(course);
        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("Error updating course: " + e.getMessage());
        }
    }

    @Override
    public Course saveCourse(Course course) {
        try {
            return courseRepository.save(course);
        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("Error saving course: " + e.getMessage());
        }
    }

    @Override
    public Course getCourseById(Long id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new CourseNotFoundException("Course not found with ID: " + id));
    }
}
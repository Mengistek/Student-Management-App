package com.edu.miu.cs.cs425.studenmgmt.model.service.ServiceImp;

import com.edu.miu.cs.cs425.studenmgmt.model.model.Course;

import java.util.List;

public interface CourseImp {
     List<Course>  getAllCourse();
      void deleteById(Long id);
      Course updateCourse(Course course, Long id);

      Course  saveCourse(Course course);

      Course getCourseById(Long id);
}

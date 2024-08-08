package com.edu.miu.cs.cs425.studenmgmt.model.ServiceImp;

import com.edu.miu.cs.cs425.studenmgmt.model.Student;
import java.util.List;

public interface StudentImp {
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    void deleteStudent(Long id);
    Student updateStudent(Student student, Long id);
    List<Student> getAllStudents();
}
package com.edu.miu.cs.cs425.studenmgmt.model.service;

import com.edu.miu.cs.cs425.studenmgmt.model.service.ServiceImp.StudentImp;
import com.edu.miu.cs.cs425.studenmgmt.model.model.Student;
import com.edu.miu.cs.cs425.studenmgmt.model.exception.StudentNotFoundException;
import com.edu.miu.cs.cs425.studenmgmt.model.studentMgmt.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements StudentImp {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        try {
            return studentRepository.save(student);
        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("Error saving student: " + e.getMessage());
        }
    }

    @Override
    public Student getStudentById(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        return student.orElseThrow(() -> new StudentNotFoundException("Student not found with ID: " + id));
    }

    @Override
    public void deleteStudent(Long id) {
        if (!studentRepository.existsById(id)) {
            throw new StudentNotFoundException("Cannot delete. Student not found with ID: " + id);
        }
        studentRepository.deleteById(id);
    }

    @Override
    public Student updateStudent(Student student, Long id) {
        if (!studentRepository.existsById(id)) {
            throw new StudentNotFoundException("Cannot update. Student not found with ID: " + id);
        }
        student.setStudentId(id);
        try {
            return studentRepository.save(student);
        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("Error updating student: " + e.getMessage());
        }
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
package com.edu.miu.cs.cs425.studenmgmt.model.studentMgmt;

import com.edu.miu.cs.cs425.studenmgmt.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
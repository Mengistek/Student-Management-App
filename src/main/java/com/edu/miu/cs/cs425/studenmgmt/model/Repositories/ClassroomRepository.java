package com.edu.miu.cs.cs425.studenmgmt.model.Repositories;

import com.edu.miu.cs.cs425.studenmgmt.model.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepository extends JpaRepository <Classroom, Long>{
}

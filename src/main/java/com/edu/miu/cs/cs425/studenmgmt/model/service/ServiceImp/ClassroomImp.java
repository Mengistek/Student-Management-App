package com.edu.miu.cs.cs425.studenmgmt.model.service.ServiceImp;

import com.edu.miu.cs.cs425.studenmgmt.model.model.Classroom;

import java.util.List;

public interface ClassroomImp {
    Classroom saveClassroom(Classroom classroom);
    Classroom getClassroomById(Long id);
    void deleteClassroom(Long id);
    List<Classroom> getAllClassroom();
    Classroom updateClassroom(Classroom classroom,Long id);
}

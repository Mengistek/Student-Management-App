package com.edu.miu.cs.cs425.studenmgmt.model.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classroomId;

    private String buildingName;
    private String roomNumber;

    @OneToMany(mappedBy = "classroom",cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Student> students;



    public Classroom(Long classroomId, String buildingName, String roomNumber) {
        this.classroomId = classroomId;
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;

    }
}

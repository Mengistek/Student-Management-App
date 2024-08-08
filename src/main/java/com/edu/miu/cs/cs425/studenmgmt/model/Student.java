package com.edu.miu.cs.cs425.studenmgmt.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    @Column(nullable = false, unique = true)
    private String studentNumber;
    @Column(nullable = false)
    private String firstName;
    private String MiddleName;
    @Column(nullable = false)
    private String lastName;

    private Double cgpa;

    @Temporal(TemporalType.DATE)
    private Date dateOfEnrollment;

    @OneToOne(cascade =CascadeType.ALL)
    @JoinColumn(name= "transcript_id",referencedColumnName = "transcriptId")
    private Transcript transcript;
    @ManyToOne
    @JoinColumn(name="classroom_id")
    private Classroom classroom;
    @ManyToMany
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;

    public Student(Long studentId, String studentNumber,
                   String firstName, String middleName, String lastName,
                   Double cgpa, Date dateOfEnrollment) {
        this.studentId = studentId;
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        MiddleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollment = dateOfEnrollment;
    }



}

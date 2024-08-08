package com.edu.miu.cs.cs425.studenmgmt.model.Exception;

public class CourseNotFoundException extends RuntimeException{
    public CourseNotFoundException(String massage){
        super(massage);
    }
}

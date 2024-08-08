package com.edu.miu.cs.cs425.studenmgmt.model.exception;

public class ClassroomNotFoundException extends RuntimeException{
    public ClassroomNotFoundException(String massage){
        super(massage);
    }
}

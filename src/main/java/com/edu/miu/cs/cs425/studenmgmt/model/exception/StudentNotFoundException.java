package com.edu.miu.cs.cs425.studenmgmt.model.exception;

public class StudentNotFoundException extends RuntimeException {
    public  StudentNotFoundException(String message){
        super(message);
    }
}

package com.edu.miu.cs.cs425.studenmgmt.model.Exception;

public class StudentNotFoundException extends RuntimeException {
    public  StudentNotFoundException(String message){
        super(message);
    }
}

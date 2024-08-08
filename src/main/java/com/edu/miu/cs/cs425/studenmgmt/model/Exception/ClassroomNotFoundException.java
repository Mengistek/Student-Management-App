package com.edu.miu.cs.cs425.studenmgmt.model.Exception;

public class ClassroomNotFoundException extends RuntimeException{
    public ClassroomNotFoundException(String massage){
        super(massage);
    }
}

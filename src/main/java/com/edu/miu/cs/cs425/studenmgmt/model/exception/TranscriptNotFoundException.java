package com.edu.miu.cs.cs425.studenmgmt.model.exception;

public class TranscriptNotFoundException extends RuntimeException{
    public TranscriptNotFoundException(String massage){
        super(massage);
    }
}

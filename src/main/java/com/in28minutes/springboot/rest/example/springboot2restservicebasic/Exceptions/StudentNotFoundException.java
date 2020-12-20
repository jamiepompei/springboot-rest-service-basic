package com.in28minutes.springboot.rest.example.springboot2restservicebasic.Exceptions;

public class StudentNotFoundException extends Throwable {

    public StudentNotFoundException(String exMessage) {
        super(exMessage);
    }
}

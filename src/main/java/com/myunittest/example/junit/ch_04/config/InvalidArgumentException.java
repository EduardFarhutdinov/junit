package com.myunittest.example.junit.ch_04.config;

public class InvalidArgumentException extends RuntimeException{
    public InvalidArgumentException(String message){
        super(message);
    }
}

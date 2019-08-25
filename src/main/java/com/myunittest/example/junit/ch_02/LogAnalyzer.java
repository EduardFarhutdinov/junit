package com.myunittest.example.junit.ch_02;

public class LogAnalyzer {
public boolean isValidLogFileName(String fileName){
    if(fileName == null || fileName.length() == 0){
        throw new IllegalArgumentException("No Filename provided!");
    }
    return fileName.toLowerCase().endsWith(".slf");
}
}

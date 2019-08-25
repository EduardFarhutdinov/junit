package com.myunittest.example.junit.ch_03;

public class FileExtensionManager implements ExtensionManager {
    @Override
    public boolean isValid(String fileName) {
        if(fileName.length() == 0){
            throw  new IllegalArgumentException("No filename provided!");
        }
        return false;
    }
}

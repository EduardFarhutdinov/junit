package com.myunittest.example.junit.ch_03;

import java.io.File;

public class FileHelper {

    public static String basenameWithoutExtension(String fileName){
        String baseName = new File(fileName).getName();
        if(baseName.contains(".")){
            baseName = baseName.substring(0,baseName.lastIndexOf('.'));
        }
        return baseName;
    }
}

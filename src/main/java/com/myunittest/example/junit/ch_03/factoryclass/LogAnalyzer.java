package com.myunittest.example.junit.ch_03.factoryclass;

import com.myunittest.example.junit.ch_03.ExtensionManager;
import com.myunittest.example.junit.ch_03.FileHelper;

public class LogAnalyzer {
    private ExtensionManager extensions;

    public LogAnalyzer(){
        this.extensions = ExtensionManagerFactory.create();
    }

    public boolean isValidLogFileName(String fileName){
        return extensions.isValid(fileName)
                && FileHelper.basenameWithoutExtension(fileName).length() > 5;
    }
}

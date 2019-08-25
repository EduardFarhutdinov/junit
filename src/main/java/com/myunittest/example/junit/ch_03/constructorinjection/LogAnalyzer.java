package com.myunittest.example.junit.ch_03.constructorinjection;

import com.myunittest.example.junit.ch_03.ExtensionManager;
import com.myunittest.example.junit.ch_03.FileExtensionManager;
import com.myunittest.example.junit.ch_03.FileHelper;

public class LogAnalyzer {
    private ExtensionManager extensions;

    public LogAnalyzer() {
        this(new FileExtensionManager());
    }

    public LogAnalyzer(ExtensionManager extensions){
        this.extensions = extensions;
    }

    public boolean isValidLogFileName(String fileName){
        return extensions.isValid(fileName)
                && FileHelper.basenameWithoutExtension(fileName).length() > 5;
    }
}

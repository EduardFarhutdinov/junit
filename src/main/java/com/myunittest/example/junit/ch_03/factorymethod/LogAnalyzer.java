package com.myunittest.example.junit.ch_03.factorymethod;

import com.myunittest.example.junit.ch_03.ExtensionManager;
import com.myunittest.example.junit.ch_03.FileExtensionManager;
import com.myunittest.example.junit.ch_03.FileHelper;

public class LogAnalyzer {

    protected ExtensionManager getExtensionManager(){
        return new FileExtensionManager();
    }
    public boolean isValidLogFileName(String fileName) {
        return getExtensionManager().isValid(fileName)
                && FileHelper.basenameWithoutExtension(fileName).length() > 5;
    }
}

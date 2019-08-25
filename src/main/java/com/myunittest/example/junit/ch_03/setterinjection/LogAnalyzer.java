package com.myunittest.example.junit.ch_03.setterinjection;

import com.myunittest.example.junit.ch_03.ExtensionManager;
import com.myunittest.example.junit.ch_03.FileExtensionManager;
import com.myunittest.example.junit.ch_03.FileHelper;

public class LogAnalyzer {
    private ExtensionManager extensionManager;

    public LogAnalyzer() {
        extensionManager = new FileExtensionManager();
    }

    public void setExtensionManager(ExtensionManager extensionManager) {
        this.extensionManager = extensionManager;
    }

    public boolean isValidFileName(String fileName){
      return extensionManager.isValid(fileName)
                && FileHelper.basenameWithoutExtension(fileName).length() > 5;
    }
}

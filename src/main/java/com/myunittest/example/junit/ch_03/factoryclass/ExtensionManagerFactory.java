package com.myunittest.example.junit.ch_03.factoryclass;

import com.myunittest.example.junit.ch_03.ExtensionManager;
import com.myunittest.example.junit.ch_03.FileExtensionManager;

public class ExtensionManagerFactory {
    private static ExtensionManager customImplementation = null;

    public static ExtensionManager create(){
        if (customImplementation != null){
            return customImplementation;
        }
        return new FileExtensionManager();
    }

    public static void setInstance(ExtensionManager implementation){
        customImplementation = implementation;
    }
}

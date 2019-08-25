package com.myunittest.example.junitTests.ch_03;

import com.myunittest.example.junit.ch_03.ExtensionManager;

public class StubExtensionManager implements ExtensionManager {
    public boolean shouldExtensionsBeValid;

    @Override
    public boolean isValid(String fileName) {
        return shouldExtensionsBeValid;
    }
}

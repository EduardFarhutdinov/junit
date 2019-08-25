package com.myunittest.example.junitTests.ch_03.constructorinjection.anotherpackage;

import com.myunittest.example.junit.ch_03.ExtensionManager;
import com.myunittest.example.junit.ch_03.constructorinjection.LogAnalyzer;
import com.myunittest.example.junitTests.ch_03.StubExtensionManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InstantiatingLogAnalyzerFromAnotherPackageTest {
    private class LogAnalyzerProxy extends LogAnalyzer {
        public LogAnalyzerProxy (ExtensionManager extensions){
            super(extensions);
        }
    }

    @Test
    public void nameShorterThan_6_CharactersIsNotValidEvenWithSupportExtension(){
        StubExtensionManager fake = new StubExtensionManager();
        fake.shouldExtensionsBeValid = true;

        LogAnalyzer log = new LogAnalyzer(fake);
        Assertions.assertFalse(log.isValidLogFileName("short.ext"));
    }
}

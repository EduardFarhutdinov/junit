package com.myunittest.example.junitTests.ch_03.factorymethod;

import com.myunittest.example.junit.ch_03.ExtensionManager;
import com.myunittest.example.junit.ch_03.factorymethod.LogAnalyzer;
import com.myunittest.example.junitTests.ch_03.StubExtensionManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogAnalyzerTest {

    @Test
    public void nameShorterThan_6_CharactersIsNotValidEvenWithSupportedExtension(){
        final StubExtensionManager fake = new StubExtensionManager();
        fake.shouldExtensionsBeValid = true;

        LogAnalyzer log = new LogAnalyzer(){
            @Override
            protected ExtensionManager getExtensionManager() {
                return fake;
            }

        };
        Assertions.assertFalse(log.isValidLogFileName("short.exe"));
    }


    @Test
    public void nameShorterThan_6_CharactersIsNotValidEvenWithSupportedExtensions(){
        final StubExtensionManager fake = new StubExtensionManager();
        fake.shouldExtensionsBeValid = true;

        TestableLogAnalyzer log = new TestableLogAnalyzer();
        log.extensionManager = fake;

        Assertions.assertFalse(log.isValidLogFileName("short.exe"));

    }

    class TestableLogAnalyzer extends LogAnalyzer{

        public ExtensionManager extensionManager;

        @Override
        protected ExtensionManager getExtensionManager() {
            return extensionManager;
        }
    }
}

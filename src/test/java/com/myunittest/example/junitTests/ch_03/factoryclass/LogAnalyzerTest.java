package com.myunittest.example.junitTests.ch_03.factoryclass;

import com.myunittest.example.junit.ch_03.factoryclass.ExtensionManagerFactory;
import com.myunittest.example.junit.ch_03.factoryclass.LogAnalyzer;
import com.myunittest.example.junitTests.ch_03.StubExtensionManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.validation.constraints.AssertFalse;

public class LogAnalyzerTest {

    @Test
    public void nameShorterThan6CharactersIsNotValidEvenWithSupportedExtension() {
        StubExtensionManager fake = new StubExtensionManager();
        fake.shouldExtensionsBeValid = true;

        ExtensionManagerFactory.setInstance(fake);

        LogAnalyzer log = new LogAnalyzer();

        Assertions.assertFalse(log.isValidLogFileName("short.crf"));

    }
}

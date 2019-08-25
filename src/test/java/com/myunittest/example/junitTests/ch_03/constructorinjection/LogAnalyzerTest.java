package com.myunittest.example.junitTests.ch_03.constructorinjection;

import com.myunittest.example.junit.ch_03.constructorinjection.LogAnalyzer;
import com.myunittest.example.junitTests.ch_03.StubExtensionManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.validation.constraints.AssertFalse;

public class LogAnalyzerTest {

    @Test
    public void nameShorterThan_6_CharactersIsNotValidEvenWithSupportedExtension(){
        StubExtensionManager fake = new StubExtensionManager();
        fake.shouldExtensionsBeValid = true;

        LogAnalyzer log = new LogAnalyzer(fake);
        Assertions.assertFalse(log.isValidLogFileName("short.ext"));
    }
}

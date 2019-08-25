package com.myunittest.example.junitTests.ch_03.settetinjection;

import com.myunittest.example.junit.ch_03.setterinjection.LogAnalyzer;
import com.myunittest.example.junitTests.ch_03.StubExtensionManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogAnalyzerTest {

    @Test
    public void nameShorterThan6CharactersIsNotValidEvenWithSupportedExtension() {
        StubExtensionManager fake = new StubExtensionManager();

        fake.shouldExtensionsBeValid = true;

        LogAnalyzer log = new LogAnalyzer();
        log.setExtensionManager(fake);

        Assertions.assertFalse(log.isValidFileName("short.exe"));

    }
}

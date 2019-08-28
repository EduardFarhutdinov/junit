package com.myunittest.example.junitTests.ch_03.constructorinjection;

import com.myunittest.example.junit.ch_03.constructorinjection.LogAnalyzer;
import com.myunittest.example.junitTests.ch_03.StubExtensionManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.*;


public class LogAnalyzerTest {

    @Test
    @DisplayName("My 1st Test")
    public void nameShorterThan_6_CharactersIsNotValidEvenWithSupportedExtension(TestInfo info){
        StubExtensionManager fake = new StubExtensionManager();
        fake.shouldExtensionsBeValid = true;

        LogAnalyzer log = new LogAnalyzer(fake);
        assertFalse(log.isValidLogFileName("short.ext"));
        assertEquals("My 1st Test",info.getDisplayName(),()-> "TestInfo is injected correctly");


    }
}

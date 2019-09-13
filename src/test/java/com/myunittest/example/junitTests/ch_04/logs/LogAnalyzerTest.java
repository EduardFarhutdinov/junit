package com.myunittest.example.junitTests.ch_04.logs;

import com.myunittest.example.junit.ch_04.logs.LogAnalyzer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LogAnalyzerTest {

    @Test
    @DisplayName("Check log error")
    void webServiceIsCalledWhenFilenameIsTooShort(){
        MockWebService webService = new MockWebService();
        LogAnalyzer log = new LogAnalyzer(webService);
        String shortNameFile = "fl.txt";

        log.analyze(shortNameFile);
        assertEquals("Filename too short:fl.txt",webService.lastError);
    }
}

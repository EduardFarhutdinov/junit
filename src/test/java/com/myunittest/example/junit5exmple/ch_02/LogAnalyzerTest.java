package com.myunittest.example.junit5exmple.ch_02;

import org.junit.jupiter.api.*;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class LogAnalyzerTest {
    private LogAnalyzer logAnalyzer;

    @BeforeEach
    void setUp(){
        logAnalyzer = new LogAnalyzer();
    }

    @Test
    void fileNameWithCorrectSuffixInUppercaseIsConsideredValid(){
        boolean result = logAnalyzer.isValidLogFileName("file.SLF");
        assertTrue(result, "filename should be valid.");
    }

    @Test
    void ileNameWithCorrectSuffixInLowercaseIsConsideredValid(){
        boolean result = logAnalyzer.isValidLogFileName("file.slf");
        assertTrue(result, "filename should be valid.");
    }

    @Test
    void emptyFileNameResultsInExceptionBeingThrown(){
        Exception exception = assertThrows(IllegalArgumentException.class,() -> logAnalyzer.isValidLogFileName(""));
        assertEquals("No Filename provided!",exception.getMessage());
    }

    @Test
    void exceptionForEmptyFileNameMakesSense(){
        try {
            logAnalyzer.isValidLogFileName("");
            fail("Expected an exception.");
        }catch (IllegalArgumentException exception){
            assertEquals("No Filename provided!",exception.getMessage());
        }
    }

    @Test
    @Disabled
    public void thisTestIsBrokenAndShouldNotBeRun() throws Exception {
        throw new RuntimeException("This should never be thrown");
    }

    @AfterAll
    @DisplayName("Result Test")
    static void tearDown() {
        Logger.getGlobal().info("Все тесты выполнены!");
    }
}
package com.myunittest.example.junitTests.ch_04.config;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestExplicitlySetConfigValues extends AbstractConfigTestCase {

    @Override
    protected String[] args() {
        return new String[] {"-f", "hello.txt", "-v", "-d" ,"-w" ,"--version"};
    }

    @Test
    public void explicitOptionsAreSetCorrectly(){
        assertEquals("hello.txt",c.getFileName());
        assertTrue(c.isDebuggingEnabled());
        assertTrue(c.isWarningsEnabled());
        assertTrue(c.isVerbose());
        assertTrue(c.shouldShowVersion());
    }
}

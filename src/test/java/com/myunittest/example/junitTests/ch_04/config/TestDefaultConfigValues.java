package com.myunittest.example.junitTests.ch_04.config;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestDefaultConfigValues extends AbstractConfigTestCase {


    @Test
    public void defaultOptionsAreSetCorrectly(){
        assertFalse(c.isDebuggingEnabled()) ;
        assertFalse(c.isWarningsEnabled()) ;
        assertFalse(c.isVerbose()) ;
        assertFalse(c.shouldShowVersion()) ;

    }
}

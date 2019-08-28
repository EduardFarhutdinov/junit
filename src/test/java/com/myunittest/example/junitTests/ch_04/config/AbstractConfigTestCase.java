package com.myunittest.example.junitTests.ch_04.config;

import com.myunittest.example.junit.ch_04.config.Configuration;
import org.junit.jupiter.api.BeforeEach;

public abstract class AbstractConfigTestCase {
    protected Configuration c;

    @BeforeEach
    public void instantiateDefaultConfiguration() {
        c = new Configuration();
//        c.processArguments(args());
    }

    protected String[] args() {
        return new String[] {};
    }
}

package com.myunittest.example.junitTests.ch_04.logs;

import com.myunittest.example.junit.ch_04.logs.WebService;

public class MockWebService implements WebService {
    public String lastError;
    @Override
    public void logError(String message) throws Exception {
    lastError = message;
    }
}

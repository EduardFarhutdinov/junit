package com.myunittest.example.junitTests.ch_04.logs;

import com.myunittest.example.junit.ch_04.logs.EmailService;
import com.myunittest.example.junit.ch_04.logs.LogAnalyzer2;
import com.myunittest.example.junit.ch_04.logs.WebService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogAnalyzer2Test {
    private static final String TOO_SHORT_FILE_NAME = "abc.txt";

    @Test
    public void fallBackToSendingEmailWhenWebServiceFails(){
        Exception simulatedException = new Exception("Simulated exception");
        WebService webService = new FailingWebService(simulatedException);
        MockEmailService emailService = new MockEmailService();
        LogAnalyzer2 log = new LogAnalyzer2(webService,emailService);
        log.analyze(TOO_SHORT_FILE_NAME);
        assertEquals("admin@logan.com",emailService.recipient);
        assertEquals(simulatedException.getMessage(),emailService.message);
        assertEquals("Failure",emailService.subject);

    }

    private class FailingWebService implements WebService{
        public Exception exceptionToThrow;

        public FailingWebService(Exception exceptionToThrow) {
            this.exceptionToThrow = exceptionToThrow;
        }

        @Override
        public void logError(String message) throws Exception {
            throw exceptionToThrow;
        }
    }

    private class MockEmailService implements EmailService{
        public String recipient;
        public String subject;
        public String message;


        @Override
        public void sendEmail(String recipient, String subject, String message) {
            this.recipient = recipient;
            this.subject = subject;
            this.message = this.message;
        }
    }
}

package com.myunittest.example.junitTests.ch_05.template;

import com.myunittest.example.junit.ch_05.template.Template;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTemplate1 {
    @Test
    public void emptyTemplate() throws Exception {
        assertEquals("", new Template("").evaluate());
    }

    @Test
    public void plainTextTemplate() throws Exception {
        assertEquals("plaintext", new Template("plaintext").evaluate());
    }
}

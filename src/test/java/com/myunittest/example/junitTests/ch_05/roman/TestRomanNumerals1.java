package com.myunittest.example.junitTests.ch_05.roman;

import org.junit.jupiter.api.Test;

import static com.myunittest.example.junit.ch_05.roman.RomanNumerals.format;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRomanNumerals1 {


    @Test
    public void one(){
        assertEquals("I",format(1));
    }
    @Test
    public void two(){
        assertEquals("II",format(2));
    }
    @Test
    public void five(){
        assertEquals("V",format(5));
    }
    @Test
    public void six(){
        assertEquals("VI",format(6));
    }
    @Test
    public void eight(){
        assertEquals("VIII",format(8));
    }
    @Test
    public void ten(){
        assertEquals("X",format(10));
    }




}

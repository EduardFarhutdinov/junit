package com.myunittest.example.junitTests.ch_04.config;

import com.myunittest.example.junit.ch_04.config.Configuration;
import com.myunittest.example.junit.ch_04.config.InvalidArgumentException;
import org.apache.commons.logging.Log;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestConfigurationErrors extends AbstractConfigTestCase {

//
//    @Override
//    protected String[] args() {
//        return new String[] { "-f" };
//    }

    @Test
    public void missingArgumentRaisesAnError(){
        /*
        Если закомметирую переопределнный метод args() и просто передам (new String[]{"-f"})
        тест проходит.А с переодпределением запутался,т.к в AbstractConfigTestCase.class происходит инициализация
        метода instantiateDefaultConfiguration() до начала теста.
         */
       Exception exception =  assertThrows(ArrayIndexOutOfBoundsException.class,() -> c.processArguments(new String[]{"-f"}));

        assertEquals("Index 1 out of bounds for length 1",exception.getMessage());



    }
}

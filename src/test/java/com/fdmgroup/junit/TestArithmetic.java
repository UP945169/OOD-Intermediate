package com.fdmgroup.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestArithmetic {
    Arithmetic arithmetic;
    @BeforeEach
    public void setUp(){
        arithmetic = new Arithmetic(); //Arrange
    }

    @Test
    public void test_MultipybyTwo_return4_when2PassedIn(){
        int result = arithmetic.multiplyByTwo(2); //Act
        assertEquals(4, result); //Assert hard coding values
    }

    @Test
    public void test_MultipybyTwo_return6_when3PassedIn(){
        int result = arithmetic.multiplyByTwo(3); //Act
        assertEquals(6, result); //Assert hard coding values
    }


    @Test
    public void test_MultipybyTwo_returnMinus4_whenMinusPassedIn(){
        int result = arithmetic.multiplyByTwo(-2); //Act
        assertEquals(-4, result); //Assert hard coding values
    }

    @Test
    public void test_MultipybyTwo_return0_when0PassedIn(){
        int result = arithmetic.multiplyByTwo(0); //Act
        assertEquals(0, result); //Assert hard coding values
    }
}

package com.fdmgroup.Mockito.Stubbing.Exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.refEq;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class TestRectangleStats {

    RectangleStatistics rs;

    @BeforeEach
    void setUp() throws Exception{
        rs = new RectangleStatistics();
    }

    @Mock
    Rectangle mockRectangle;

    @Test
    void test_calculateArea_returns20_whenRectangleWithWidth4AndLength5PassedIn() {
        //stubbing statements
        when(mockRectangle.getWidth()).thenReturn(5);
        when(mockRectangle.getLength()).thenReturn(4);

        int area = rs.calculateArea(mockRectangle);

        assertEquals(20, area);

        //fail first time then pass when logic is created
    }

    @Test
    void test_calculateArea_returns35_WhenRectangleWithWidth5AndLength7PassedIn(){
        //stubbing statements
        when(mockRectangle.getLength()).thenReturn(7);
        when(mockRectangle.getWidth()).thenReturn(5);

        int area = rs.calculateArea(mockRectangle);

        assertEquals(35,area);
    }

    @Test
    void test_calculateCircumference_returns22_whenRectangleWithWidth3AndLength8PassedIn() {
        //stubbing statements
        when(mockRectangle.getWidth()).thenReturn(3);
        when(mockRectangle.getLength()).thenReturn(8);

        int circumference = rs.calculateCircumference(mockRectangle);

        assertEquals(22,circumference);
    }

    @Test
    void test_calculateCircumference_returns60_whenRectangleWithWidth10AndLength20PassedIn(){
        //stubbing statements
        when(mockRectangle.getWidth()).thenReturn(10);
        when(mockRectangle.getLength()).thenReturn(20);

        int circumference = rs.calculateCircumference(mockRectangle);

        assertEquals(60,circumference);
    }
}

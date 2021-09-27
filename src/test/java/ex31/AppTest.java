/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mateo Gamero
 */
package ex31;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    App appTest =new App();
    @Test
    void validateNumber()
    {
        assertFalse(appTest.validateNumber("234"));//Is an integer
        assertTrue(appTest.validateNumber("as34"));//Is not an integer

    }

    @ParameterizedTest
    @ValueSource(doubles = {.55, .60, .65, .7, .75, .8, .85, .9, .95})
    void calculateTargetHeartRate(double nums)
    {
        double expected = (((220 - 22) - 65) * nums) + 65;
        assertEquals(expected, appTest.calculateTargetHeartRate(22, 65, nums));
    }
}
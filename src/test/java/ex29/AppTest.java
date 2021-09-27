/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mateo Gamero
 */
package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    App appTest = new App();
    @Test
    void validateRate()
    {
        assertFalse(appTest.validateRate("234"));//Is an integer
        assertTrue(appTest.validateRate("as34"));//Is not an integer
    }

    @Test
    void returnYears()
    {
        assertEquals(18, appTest.returnYears(4));
        assertEquals(36, appTest.returnYears(2));
    }
}
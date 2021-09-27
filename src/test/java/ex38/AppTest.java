/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mateo Gamero
 */
package ex38;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void filterEvenNumbers()
    {
        App appTest = new App();
        int[] array = {1, 10, 24, 21, 42, 63, 13};
        ArrayList<Integer> evenInt = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        result.add(10);
        result.add(24); result.add(42);
        assertEquals(result, appTest.filterEvenNumbers(array, evenInt));
     }
}
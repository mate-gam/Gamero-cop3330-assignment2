/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mateo Gamero
 */
package ex35;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void randomWinner()
    {
        App appTest = new App();
        ArrayList<String> names = new ArrayList<String>();
        names.add("Mateo");
        names.add("Ocean");
        names.add("Squidward");
        names.add("Patrick");
        names.add("Spongebob");
        assertAll(() -> assertEquals(names.get(0), appTest.randomWinner(names, 0)),
                () -> assertEquals(names.get(1), appTest.randomWinner(names, 1)),
                () -> assertEquals(names.get(2), appTest.randomWinner(names, 2)),
                () -> assertEquals(names.get(3), appTest.randomWinner(names, 3)),
                () -> assertEquals(names.get(4), appTest.randomWinner(names, 4)),
                () -> assertNotEquals(names.get(3), appTest.randomWinner(names, 2)));
    }
}
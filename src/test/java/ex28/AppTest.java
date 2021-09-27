/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mateo Gamero
 */
package ex28;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.RepetitionInfo;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void addValueToTotal()
    {
        App app = new App();
        int total = 0;
        for (int i = 1; i < 6; i++)
        {
            System.out.println(i + "+" + total + "=" + app.addValueToTotal(total, i));
            assertEquals(total + i, app.addValueToTotal(total,i));
            total += i;
        }
    }
}
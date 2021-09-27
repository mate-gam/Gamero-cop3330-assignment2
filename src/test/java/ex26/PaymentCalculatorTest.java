/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mateo Gamero
 */
package ex26;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        PaymentCalculator paymentCalculatorTest = new PaymentCalculator();
        assertAll(() -> assertEquals(70, paymentCalculatorTest.calculateMonthsUntilPaidOff(5000, 12, 100)),
                () -> assertEquals(132, paymentCalculatorTest.calculateMonthsUntilPaidOff(4000, 10, 50)),
                () -> assertNotEquals(69, paymentCalculatorTest.calculateMonthsUntilPaidOff(5000, 12, 100)));
    }
}
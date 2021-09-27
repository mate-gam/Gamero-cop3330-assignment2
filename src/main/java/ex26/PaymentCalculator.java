/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mateo Gamero
 */
package ex26;
import java.lang.Math;
public class PaymentCalculator {
    public double calculateMonthsUntilPaidOff(double balance, double percent, double month)
    {
        double number = (double)1/30;
        double realPercent = percent/100;
        //rounding up
        return Math.ceil(-(number) * Math.log(1+balance/month *
                (1 - Math.pow((1 + (realPercent/365)), 30))) / Math.log(1 + realPercent/365));
    }
}

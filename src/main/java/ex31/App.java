/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mateo Gamero
 */
package ex31;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;
public class App
{
    boolean validateNumber(String num)
    {
        //makes sure the double num is valid
        try
        {
            Double.parseDouble(num);
            return false;
        } catch (NumberFormatException e)
        {
            System.out.println("Sorry. That's not a valid input.");
            return true;
        }
    }

    double calculateTargetHeartRate (double age, double restingHR, double intensity)
    {
        //calculation
        return (((220 - age) - restingHR) * intensity) + restingHR;
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        App app = new App();
        String pulse;
        //gets valid input
        do {
            System.out.print("What is the resting pulse? ");
            pulse = sc.next();
        } while (app.validateNumber(pulse));
        String age;
        do {
            System.out.print("What is your age? ");
            age = sc.next();
        } while (app.validateNumber(age));
        //makes it a double after confirmation
        double pulseDouble = Double.parseDouble(pulse);
        double ageDouble = Double.parseDouble(age);
        //formatting print
        System.out.println("Resting Pulse: " + Math.round(pulseDouble) + "\t Age: " + Math.round(ageDouble) + "\n");
        System.out.format("%4s | %4s \n", "Intensity", "Rate");
        System.out.println("----------|--------");
        //prints the intensity and bpm
        for (double intensity = .55; intensity <= .97; intensity += .05)
        {
            System.out.println(Math.round(intensity * 100) + "%       | " +
                    Math.round(app.calculateTargetHeartRate(ageDouble, pulseDouble, intensity)) + " bpm");
        }
    }
}

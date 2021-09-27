/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mateo Gamero
 */
package ex36;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
public class App
{
    double average (ArrayList<Double> arrayList)
    {
        //finds the average of our list
        double avg = 0;
        for (int i = 0; i < arrayList.size(); i++)
        {
            avg += arrayList.get(i);
        }
        avg /= arrayList.size();
        return Math.round((avg *100.0) * 10.0) / 1000.0;
    }
    double max (ArrayList<Double> arrayList)
    {
        //finds the max of our list
        double max = arrayList.get(0);
        for (int i = 0 ; i < arrayList.size(); i++)
        {
            if (max < arrayList.get(i))
                max = arrayList.get(i);
        }
        return max;
    }
    double min (ArrayList<Double> arrayList)
    {
        //finds the mins of our list
        double min = arrayList.get(0);
        for (int i = 0 ; i < arrayList.size(); i++)
        {
            if (min > arrayList.get(i))
                min = arrayList.get(i);
        }
        return min;
    }
    double std (ArrayList<Double> arrayList)
    {
        //finds the standard deviation of our list
        App app = new App();
        double std = 0, avg = 0;
        //finding std
        for (int i = 0; i < arrayList.size(); i++)
        {

            avg += Math.pow(arrayList.get(i) - app.average(arrayList), 2);
        }
        std = avg/(arrayList.size());
        std = Math.sqrt(std);
        return Math.round(std * 100.0) / 100.0;
    }
    public static void main (String[] args)
    {
        App app = new App();
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numberArray = new ArrayList<Double>();
        String number = "";
        //checks that the input is valid
        do
        {
            System.out.print("Enter a number: ");
            number = sc.nextLine();
            try
            {
                if (number.equals("done"))
                    break;
                double num = Double.parseDouble(number);
            }
            catch ( NumberFormatException e)
            {
                System.out.println("Invalid input");
            }
            if (!number.equals("done"))
            {
                numberArray.add(Double.parseDouble(number));
            }
        } while(!number.equals("done"));//stops when user enter done
        //does the calculating
        double avg = app.average(numberArray), std = app.std(numberArray), min = app.min(numberArray),
                max = app.max(numberArray);
        //prints
        System.out.format("The average is %.1f\nThe minimum is %.0f\nThe maximum is %.0f\nThe standard deviation is %.2f\n",
                avg, min, max, std);
    }
}

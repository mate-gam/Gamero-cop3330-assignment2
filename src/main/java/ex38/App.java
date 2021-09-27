/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mateo Gamero
 */
package ex38;
import java.util.Scanner;
import java.util.ArrayList;
public class App
{
    ArrayList<Integer> filterEvenNumbers (int[] notEven, ArrayList<Integer> even)
    {
        //gets all of the even numbers from array
        for (int i = 0; i < notEven.length; i++)
        {
            if (notEven[i] % 2 == 0)
            {
                even.add(notEven[i]);
            }
        }
        return even;
    }
    void printArray (ArrayList<Integer> arrayList)
    {
        //prints array
        for (int i = 0; i < arrayList.size(); i++)
        {
            System.out.print(arrayList.get(i) + " ");
        }
    }
    public static void main (String[] args)
    {
        App app = new App();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a list of numbers, seperated by spaces: ");
        String numbersInputed = sc.nextLine();
        String[] stringArray = numbersInputed.split("\\s+");//splits array after every space
        int[] intArray = new int[stringArray.length];
        //makes it an integer array
        for (int i = 0; i < stringArray.length; i++)
        {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        //finds the even numbers
        ArrayList<Integer> evenNumberArray = new ArrayList<Integer>();
        evenNumberArray = app.filterEvenNumbers(intArray,evenNumberArray);
        //prints
        System.out.print("The even numbers are ");
        app.printArray(evenNumberArray);
        System.out.print("\n");
    }
}

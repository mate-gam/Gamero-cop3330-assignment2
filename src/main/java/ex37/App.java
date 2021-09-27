package ex37;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class App
{
    ArrayList<String> randomPassword(ArrayList<String> password, int length, int specialChar, int digits)
    {
        ArrayList<String> letterArray = new ArrayList<String>(), specialArray = new ArrayList<String>(),
                digitArray = new ArrayList<String>();
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ", digitsString = "123456789",
                special = "!\"#$%&'-./:;<=>?@[\\]^_`{|}~";
        for (int i = 0; i < digitsString.length(); i++)
        {
            digitArray.add(String.valueOf(digitsString.charAt(i)));
        }
        for (int i = 0; i < special.length(); i++)
        {
            specialArray.add(String.valueOf(special.charAt(i)));
        }
        for (int i = 0; i < letters.length(); i++)
        {
            letterArray.add(String.valueOf(letters.charAt(i)));
        }
        Random rand = new Random();
        int digCount = 0, speCount = 0, letterCount = 0;
        for (int i = 0; i < length; i++)
        {
            int random012 = rand.nextInt(3);
            if (random012 == 0 && speCount < specialChar)
            {
                int random = rand.nextInt(specialArray.size());
                password.add(specialArray.get(random));
                speCount++;
            }
            if (random012 == 1 && digCount < digits)
            {
                int random = rand.nextInt(digitArray.size());
                password.add(digitArray.get(random));
                digCount++;
            }
            else
            {
                int random = rand.nextInt(letterArray.size());
                password.add(letterArray.get(random));
                letterCount++;
            }
            if (i == length - 1 && letterCount <= digCount + speCount)
            {
                length++;
            }
        }
        return password;
    }
    void printArray (ArrayList<String> array)
    {
        for (int i = 0; i < array.size(); i++)
            System.out.print(array.get(i));
        System.out.print("\n");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        App app = new App();
        System.out.print("What's the minimum length? ");
        int minLen = sc.nextInt();
        System.out.print("How many special characters? ");
        int maxSpecialChar = sc.nextInt();
        System.out.print("How many numbers? ");
        int numbersMax = sc.nextInt();

        Random rand = new Random();
        int randomNumber = rand.nextInt(10);
        ArrayList<String> randomPassword = new ArrayList<String>();
        randomPassword = app.randomPassword(randomPassword, minLen, maxSpecialChar, numbersMax);
        System.out.print("Your password is ");
        app.printArray(randomPassword);

    }
}

package ex32;
import java.util.Random;
import java.util.Scanner;
public class App
{
    int findRandomNumber (int difficulty)
    {
        Random rand = new Random();
        if (difficulty == 1)
        {
            return rand.nextInt(10) + 1;
        }
        if (difficulty == 2)
        {
            return rand.nextInt(100) + 1;
        }
        if (difficulty == 3)
        {
            return rand.nextInt(1000) + 1;
        }
        return 0;
    }
    String tooLowOrTooHigh (int guess, int randomNumber)
    {
        return "Your mom";
    }
    public static void main (String[] args)
    {
        App app = new App();
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's play Guess the Number!");
        System.out.println("Enter the difficulty level (1, 2, or 3): ");
        int randomNumber = app.findRandomNumber(sc.nextInt());
        System.out.print("I have my number. What's your guess? ");
        System.out.print("What's your guess? ");
        int guess = sc.nextInt();

    }
}

package ex33;
import java.util.Scanner;
import java.util.Random;
public class App
{
    String randomPrint(String[] array, int random)
    {
        return array[random];
    }
    public static void main(String[] args)
    {
        App app = new App();
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("What's your question? \n> ");
        String question = sc.next();
        String[] eightBall = {"Yes", "No", "Maybe", "Ask again later."};
        int randomNumber = rand.nextInt(4);
        System.out.println(app.randomPrint(eightBall, randomNumber)) ;
    }
}

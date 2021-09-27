package ex28;
import java.util.Scanner;
public class App {
    int addValueToTotal(int num, int total)
    {
        return total + num;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        App app = new App();
        int total = 0;
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            total = app.addValueToTotal(num, total);
        }
        System.out.println("The total is " + total + ".");
    }
}

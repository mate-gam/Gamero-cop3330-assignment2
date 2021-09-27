package ex26;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your balance? ");
        double bal = sc.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        double percent = sc.nextDouble();
        System.out.print("What is the monthly payment you can make? ");
        double monthly = sc.nextDouble();
        PaymentCalculator paymentCalculator = new PaymentCalculator();
        double total = paymentCalculator.calculateMonthsUntilPaidOff(bal, percent, monthly);
        System.out.println("It will take you " + total + " to pay off this card.");
    }
}

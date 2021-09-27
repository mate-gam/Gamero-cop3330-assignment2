package ex31;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;
public class App
{
    boolean validateNumber(String num)
    {
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
        return (((220 - age) - restingHR) * intensity) + restingHR;
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        App app = new App();
        String pulse;
        do {
            System.out.println("What is the rate of return? ");
            pulse = sc.next();
        } while (app.validateNumber(pulse));
        String age;
        do {
            System.out.println("What is the rate of return? ");
            age = sc.next();
        } while (app.validateNumber(age));
        double pulseDouble = Double.parseDouble(pulse);
        double ageDouble = Double.parseDouble(age);
        System.out.println("Resting Pulse :" + Math.round(pulseDouble) + "\t Age: " + Math.round(ageDouble) + "\n");
        System.out.format("%4s | %4s \n", "Intensity", "Rate");
        System.out.println("----------|--------");
        for (double intensity = .55; intensity <= .97; intensity += .05)
        {
            System.out.println(Math.round(intensity * 100) + "%       | " +
                    Math.round(app.calculateTargetHeartRate(ageDouble, pulseDouble, intensity)) + " bpm");
        }
    }
}

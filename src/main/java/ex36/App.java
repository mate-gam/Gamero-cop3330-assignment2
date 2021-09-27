package ex36;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
public class App
{
    double average (ArrayList<Double> arrayList)
    {
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
        App app = new App();
        double std = 0, avg = 0;
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
        } while(!number.equals("done"));
        double avg = app.average(numberArray), std = app.std(numberArray), min = app.min(numberArray),
                max = app.max(numberArray);
        System.out.format("The average is %.1f\nThe minimum is %.0f\nThe maximum is %.0f\nThe standard deviation is %.2f\n",
                avg, min, max, std);
    }
}

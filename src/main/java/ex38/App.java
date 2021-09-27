package ex38;
import java.util.Scanner;
import java.util.ArrayList;
public class App
{
    ArrayList<Integer> filterEvenNumbers (int[] notEven, ArrayList<Integer> even)
    {
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
        String[] stringArray = numbersInputed.split("\\s+");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++)
        {
            String intString = stringArray[i];
            intArray[i] = Integer.parseInt(intString);
        }

        ArrayList<Integer> evenNumberArray = new ArrayList<Integer>();
        evenNumberArray = app.filterEvenNumbers(intArray,evenNumberArray);
        System.out.print("The even numbers are ");
        app.printArray(evenNumberArray);
        System.out.print("\n");
    }
}

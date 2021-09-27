package ex35;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class App
{
    ArrayList<String> inputName (ArrayList<String> arrayList)
    {
        Scanner sc = new Scanner(System.in);
        String name;
        do {
            System.out.print("Enter a name: ");
            name = sc.nextLine();
            if (!name.equals(""))
            {
                arrayList.add(name);
            }
        }while (!name.equals(""));
        return arrayList;
    }
    String randomWinner (ArrayList<String> nameArray, int randomNum)
    {
        return nameArray.get(randomNum);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        App app = new App();
        ArrayList<String> nameArray = new ArrayList<>();

        nameArray = app.inputName(nameArray);

        Random rand = new Random();
        int randnum = rand.nextInt(nameArray.size());

        System.out.println("The winner is... " + nameArray.get(randnum));
    }
}

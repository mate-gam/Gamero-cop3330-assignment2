package ex30;

public class App
{
    String multiplicationTable ()
    {
        String output = "";
        for (int i = 1; i < 13; i++)
        {
            for (int j = 1; j < 13; j++)
            {
                output += String.format("%-5d", i * j);
            }
            if (i != 12)
            {
                output += "\n";
            }
        }
    return output;
    }
    public static void main (String[] args)
    {
        App app = new App();
        System.out.println(app.multiplicationTable());
    }
}

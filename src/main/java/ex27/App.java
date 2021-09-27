package ex27;
import java.util.Scanner;
public class App
{
    boolean stringLength(String name)
    {
        int length = name.length();
        return length == 0;
    }

    boolean stringSize(String name)
    {
        int length = name.length();
        return length < 2;
    }

    boolean validateID(String employeeID)
    {
        int len = employeeID.length();
        if (!Character.isLetter(employeeID.charAt(0)))
        {
            return false;
        }
        if (!Character.isLetter(employeeID.charAt(1)))
        {
            return false;
        }
        if (employeeID.indexOf("-") != 2)
        {
            return false;
        }
        for (int i = 3; i < 7; i++)
        {
            if (!Character.isDigit(employeeID.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
    boolean validateZip(String zip)
    {
        if (zip.length() != 5)
        {
            return false;
        }
        for (int i = 0; i < 5; i++)
        {
            if (!Character.isDigit(zip.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
    String validateInput(String firstName, String lastName, String zip, String employeeID) {
        String output = "";
        int errors = 0;
        if (stringSize(firstName)) {
            output += "The first name must be at least 2 characters long.\n";
            errors += 1;
        }
        if (stringLength(firstName)) {
            output += "The first name must be filled in.\n";
            errors += 1;
        }
        if (stringSize(lastName)) {
            output += "The last name must be at least 2 characters long.\n";
            errors += 1;
        }
        if (stringLength(lastName)) {
            output += "The last name must be filled in.\n";
            errors += 1;
        }
        if (!validateID(employeeID)) {
            output += "The employee ID must be in the format of AA-1234.\n";
            errors += 1;
        }
        if (!validateZip(zip)) {
            output += "The zipcode must be a 5 digit number.";
        }
        if (errors == 0)
        {
            output += "There were no errors found.";
        }
        return output;
    }
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter the last name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zip = sc.nextLine();
        System.out.print("Enter the employee ID: ");
        String employeeID = sc.nextLine();
        App app = new App();
        System.out.println(app.validateInput(firstName,lastName,zip,employeeID));
    }
}

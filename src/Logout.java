import java.io.IOException;

public class Logout extends Main
{
    public static void logout() throws IOException
    {
        System.out.println("Are you sure you want to Logout? (y/n)");
        String l = sc.nextLine();
        if (l.equals("y"))
        {
            System.out.println("Logout Successfully");
            System.out.println("\033[0;1m" + "Have a Good day, Bye...");
            Mainpage.mainpage();
        }
        else
        {
            System.out.println("You are still logged in");
        }
    }
}
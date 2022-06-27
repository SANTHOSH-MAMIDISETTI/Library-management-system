import java.util.Date;

public class Delete_Membership extends Main {

    public static void DeleteMembership()
    {
        String date = java.time.LocalDate.now().toString();
        if(DueDate.DueDate().equals(date))
        {
            System.out.println("Your Membership is Expired");

        }
        else
        {
            System.out.println("Your Membership is Valid");
        }
    }
}

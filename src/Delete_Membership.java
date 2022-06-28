public class Delete_Membership extends Main {

    public static void DeleteMembership()
    {
        String date = java.time.LocalDate.now().toString();
        if(DueDate.DueDate().equals(date))
        {
            System.out.println("Your Membership is Expired");

            System.out.println("Please Renew your Membership");
        }
        else
        {
            System.out.println("Your Membership is Valid");
        }
    }
}

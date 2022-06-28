import java.util.Calendar;
import java.util.Date;

class Take_Membership extends DueDate  {
    static String garuda = "\033[0;1m"+"\u001B[33m" + "Garuda Library  " + "\u001B[0m" ;

    public static void Takemembership(){

        String ignore = sc.nextLine();
        System.out.println("Username: ");
        String Membershipname = sc.nextLine();
        System.out.println("Password: ");
        String Password_Membershipcard= sc.nextLine();
        boolean check = false;
        int age ;
        getAge(check, sc.nextLine(), sc.nextInt());

        System.out.println("The date  and time of issue is : ");
        Date today = new Date();
        System.out.println(today);
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        String date = java.time.LocalDate.now().toString();

//        System.out.println("Your membership will expire after 30 days i.e on"+DueDate.dueDate());
//        System.out.print("Your membership will expire after 30 days i.e on ");
//        DueDate.DueDate();
        String newDate = DueDate.DueDate();
        System.out.println("\033[0;1m"+"\nPay 65/- to librarian and collect physical membership card");

/*
------------------------------------------------------------------------------------------------------------
|          System.out.println("\033[0;1m"+"\u001B[33m" + "Garuda Library: " + "\u001B[0m");                    |
------------------------------------------------------------------------------------------------------------
|                                                                                                                                                                 |
|  Name          = Menmbershipname;                                                                                                          |
|                                                                                                                                                                 |
|  Issued Date = date;                                                                                                                                 |
|                                                                                                                                                                 |
|                               valid upto 30days from date of issue                                                                          |
|                                                                                                                                                                 |
--------------------------------------------------------------------------------------------------------------
*/
        System.out.println("------------------------------------------------------------------------------------------------------------\n" +
                "|                                             "+       garuda                 + "                                                                                         |\n"+
                "------------------------------------------------------------------------------------------------------------\n" +
                "|                                                                                                                                                                 |\n" +
                "|  Name         = "+ Membershipname+"                                                                                                                               |\n" +
                "|                                                                                                                                                                 |              \n" +
                "|  Issued Date = "+ date+"                                                                                                                       |             \n" +
                "|                                                                                                                                                                 |  \n" +
                "|                               valid upto "+newDate+" (30days from date of issue)                                                                          |  \n" +
                "|                                                                                                                                                                 |                  \n" +
                "--------------------------------------------------------------------------------------------------------------");

    }

    public static void getAge(boolean check, String s, int i) {
        int age;
        do{
            System.out.println("Please enter your age");
            try{
                age = Integer.parseInt(s);
                check = true;
                while (age < 0)
                {
                    System.out.println("Please enter a valid age");
                    age = i;
                }
            }catch(Exception e){
                System.out.println("Invalid value");
            }
        }while(!check);
    }
}
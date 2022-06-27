 class Take_Membership extends Main {
    static String garuda = "\033[0;1m"+"\u001B[33m" + "Garuda Library  " + "\u001B[0m" ;

    public static void Takemembership(){

        String ignore = sc.nextLine();
        System.out.println("Username: ");
        String Membershipname = sc.nextLine();
        System.out.println("Password: ");
        String Password_Membershipcard= sc.nextLine();
        System.out.println("The date of issue is (dd - mm - yyyy ): ");
        String date = java.time.LocalDate.now().toString();
        System.out.println("Enter your Age: ");
        int age = sc.nextInt();
        System.out.println("Your memebership will expire after 30 days");
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
                "|                               valid upto 30days from date of issue                                                                          |  \n" +
                "|                                                                                                                                                                 |                  \n" +
                "--------------------------------------------------------------------------------------------------------------");

    }
}
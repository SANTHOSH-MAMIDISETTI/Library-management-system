 class Mainpage extends Main{
    public static void mainpage(){

        System.out.println("\033[0;1m"+"\u001B[33m"
                + "                                   LIBRARY MANAGEMENT SYSTEM (LMS) "
                + "\u001B[0m");
        System.out.println("\033[0;1m"+"\u001B[33m"
                + "Garuda Library: "
                + "\u001B[0m");
        System.out.println("[1] New User \n[2] Login User \n[3] Logout \n[4] Librarian Login");
        int login = sc.nextInt();

        switch (login){
            case 1 :
                Newuser.newuser();
                break;

            case 2 :
                System.out.println("Your Library Username: ");
                String libraryusername = sc.next();
                System.out.println("Password: ");
                String librarypassword = sc.next();
                //
                //
                //
                //
                //

                break;

            case 3 :
                Logout();
                break;

            case 4 :
                Librarian_Login.Librarianlogin();
                break;

            default:
                System.out.println("Wrong entry");
        }
    }


}

import java.util.Scanner;

public class Main {
    static int b;
   static Scanner sc = new Scanner(System.in);
   static String garuda = "\033[0;1m"+"\u001B[33m" + "Garuda Library: " + "\u001B[0m" ;
    public static void Newuser(){

        System.out.println("Welcome to Garuda Library ");
        System.out.println("[1] Guest Reader \n[2] Create Account \n[3] Take Membership \n[4] Back \n[5] Exit");
        int newuser = sc.nextInt();
        switch (newuser){
            case 1 :
                System.out.println("Type your Name: ");
                String name = sc.next();
                System.out.println("Type your Phone Number: ");
                String Phone_Number = sc.next();
                System.out.println("Welcome "+name+",\nAccount on your Name is created Temporarily (For 24Hours)\n");
                break;

            case 2 :
                Random.random();
                System.out.println("Username: ");
                String username = sc.next();
                System.out.println("Password: ");
                String password = sc.next();
                System.out.println("Account on "+username+" has been created successfully...");
                System.out.println("Your ID is "+ Random.b);
                break;

            case 3 :
                Take_Membership.Takemembership();
                break;

            case 4 :
                    mainpage();
                    break;

            case 5 :
                Logout();
                break;

            default:
                System.out.println("Wrong entry...");
        }
    }

    public static void Logout(){
        System.out.println("\033[0;1m"+"Have a Good day, Bye...");
    }


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
                Newuser();
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

    public static void main(String[]args){
    Main main = new Main();
    main.mainpage();
    }
}

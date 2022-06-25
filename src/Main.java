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
                Guest_Reader.guestreader();
                break;

            case 2 :
                Create_Account.createaccount();
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

        System.out.println("\033[0;1m"+"\u001B[33m" + "                                            LIBRARY MANAGEMENT SYSTEM (LMS) " + "\u001B[0m");

        System.out.println("\033[0;1m"+"\u001B[44m" + "\u001B[30m"+"Garuda Library: " + "\u001B[0m");

        System.out.println("[1] New User \n[2] Login User \n[3] Logout \n[4] Librarian Login");
        int login = sc.nextInt();

        switch (login){
            case 1 :
                Newuser();
                break;

            case 2 :
                Login.login();
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

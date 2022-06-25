class Librarian_Login extends Main {
static String Librarian_username;
static String Librarian_password;
public static boolean librarian_login() {

        String Librarian_name1 = "Neeraj";
        String Librarian_name2 = "Sushanth";
        String Librarian_name3 = "Tejo";
        String Librarian_name4 = "Reddy";
        String Librarian_name5 = "Santhosh";
        String Librarian_name6 = "Narayana";
        String password_librarian = "Garuda123";
        String Libraian_number = "7093562964";

        String ignore = sc.nextLine();
        System.out.println("Enter Username: ");
        String Librarian_username = sc.nextLine();
        System.out.println("Enter Password: ");
        String Librarian_password = sc.nextLine();

        if ((Librarian_username.equals(Librarian_name1)  || Librarian_username.equals(Librarian_name2) || Librarian_username.equals(Librarian_name3) ||Librarian_username.equals(Librarian_name4)
        || Librarian_username.equals(Librarian_name5) || Librarian_username.equals(Librarian_name6) )&& Librarian_password.equals(password_librarian)) {

        return true;

        }

        else {

        return false;

        }
    }
}

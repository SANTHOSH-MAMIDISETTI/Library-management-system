import java.io.IOException;

public class Login extends Main{
    public static void login() throws IOException {
        Create_Account c = new Create_Account();
        String ignore = sc.nextLine();
        while (true) {
            System.out.println("Your Library Username: ");
            String libraryusername = sc.nextLine();
            if (libraryusername.equals(c.array[0])) {
                System.out.println("Password: ");
                String librarypassword = sc.nextLine();
                String pass = c.map.get(libraryusername);
                if (librarypassword.equals(pass)) {
                    Newuser.newuser();

                }
            }
            else {
                System.out.println("Username is Incorrect");
            }






        }
    }
}

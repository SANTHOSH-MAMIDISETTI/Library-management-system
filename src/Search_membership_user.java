import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Search_membership_user {

    public static void search_membership_user() throws IOException {
        System.out.println("Enter Username to search");
        String username = Main.sc.next();
        String line1;
        FileReader file12 = new FileReader("Membership.txt");
        BufferedReader file23 = new BufferedReader(file12);

        while ((line1 = file23.readLine()) != null) {
            if (line1.contains(username)) {
                System.out.println("Username: " + line1.split(",",6)[0]);
                System.out.println("Password: " + line1.split(",",6)[1]);
                System.out.println("address: " + line1.split(",",6)[2]);
                System.out.println("Date of Membership taken: " + line1.split(",",6)[3]);
                System.out.println("age: " + line1.split(",",6)[4]);
                System.out.println("ID: " + line1.split(",",6)[5]);
            }
            else{
                System.out.println("User not found");
            }
        }

    }
}

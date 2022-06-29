import java.io.*;

public class Delete_membership_user {
    public static void delete_membership_user() throws IOException {
        System.out.println("Enter Username to delete");
        String username = Main.sc.next();
        String line2;
        FileReader file12 = new FileReader("Membership.txt");
        BufferedReader file23 = new BufferedReader(file12);
        FileReader file24 = new FileReader("Login.txt");
        BufferedReader file25 = new BufferedReader(file24);
        String line3;
        while ((line2 = file23.readLine()) != null) {
            if (line2.contains(username)) {
                remove_user.removeLineFromFile("Membership.txt", line2);
            }
            else{
                System.out.println("User not found");
            }

        }
        while ((line3 = file25.readLine()) != null) {
            if (line3.contains(username)) {
                remove_user.removeLineFromFile("Login.txt", line3);
            }
        }



    }
}

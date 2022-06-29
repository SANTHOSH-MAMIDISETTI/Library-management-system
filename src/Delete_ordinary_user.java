import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Delete_ordinary_user {
    public static void delete_ordinary_user() throws IOException {
        System.out.println("Enter Username to delete");
        String username = Main.sc.next();
        String line;
        FileReader file11 = new FileReader("USERNAME.txt");
        BufferedReader file22 = new BufferedReader(file11);
        FileReader file24 = new FileReader("Login.txt");
        BufferedReader file25 = new BufferedReader(file24);
        String line3;
        while ((line = file22.readLine()) != null) {
            if (line.contains(username)) {
                remove_user.removeLineFromFile("USERNAME.txt", line);
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

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Deleteuser   {
    public static void deleteuser() throws IOException {
        System.out.println("[1]Delete Membership User");
        System.out.println("[2]Delete Ordinary User");
        System.out.println("[3]Back");
        int choice = Main.sc.nextInt();
        switch (choice){
            case 1 :
                Delete_membership_user.delete_membership_user();
                break;
            case 2 :
                Delete_ordinary_user.delete_ordinary_user();
                break;
            case 3 :
                Librarian.librarian();
                break;
            default:
                System.out.println("Wrong entry");
        }
    }
}


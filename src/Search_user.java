import java.io.IOException;

public class Search_user {
    public static void searchuser() throws IOException {
        System.out.println("[1]Search Membership User");
        System.out.println("[2]Search Ordinary User");
        System.out.println("[3]Back");
        int choice = Main.sc.nextInt();
        switch (choice){
            case 1 :
                Search_membership_user.search_membership_user();
                break;
            case 2 :
                Search_ordinary_user.search_ordinary_user();
                break;
            case 3 :
                Librarian.librarian();
                break;
            default:
                System.out.println("Wrong entry");
        }

    }
}

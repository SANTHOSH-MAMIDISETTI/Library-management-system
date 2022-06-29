import java.io.IOException;

public class Librarian {
    public static void librarian() throws IOException {
        System.out.println("[1]Add user \n [2] Delete User \n [3] search user");
        int choice = Main.sc.nextInt();
        switch (choice){
            case 1 :
                Create_Account.create();
                break;
            case 2 :
                Deleteuser.deleteuser();
                break;
            case 3 :
                Search_user.searchuser();
                break;
            default:
                System.out.println("Wrong entry");
        }


        //manage users
        //display all books
        //search books
        // add and delete book
        // fines manage
        //issued books list
        //return book history
        // users history
        //Book suggestions
        // Nama shivaya slogans

    }
}
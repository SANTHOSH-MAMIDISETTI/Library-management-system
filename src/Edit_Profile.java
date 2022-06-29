import java.io.*;

public class Edit_Profile extends ViewUser_Account{
    public static void edit_profile() throws IOException {
        System.out.println("[1]Edit Username");
        System.out.println("[2]Edit Password");
        System.out.println("[3]Edit Address");
        System.out.println("[4]Edit Age");
        System.out.println("[5]Back");
        int choice = sc.nextInt();
        switch (choice){
            case 1 :
                Edit_Username.edit_username();
                break;
            case 2 :
                Edit_Password.edit_password();
                break;
            case 3 :
                Edit_Address.edit_address();
                break;
            case 4 :
                Edit_Age.edit_age();
                break;
            case 5 :
                Library.library();
                break;
            default:
                System.out.println("Wrong entry");
        }
    }


}

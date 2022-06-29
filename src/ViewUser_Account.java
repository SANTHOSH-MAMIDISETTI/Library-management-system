import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class ViewUser_Account extends Library {
    public static void viewuser_account() throws IOException {

        FileReader file11 = new FileReader("USERNAME.txt");
        BufferedReader file22 = new BufferedReader(file11);
        String line;

        while((line=file22.readLine())!=null){
            if(line.contains(libraryusername)){

                System.out.println("Username: " + line.split(",",5)[0]);
                System.out.println("Password: " + line.split(",",5)[1]);
                System.out.println("ID: " + line.split(",",5)[2]);
                System.out.println("Age: " + line.split(",",5)[3]);
                System.out.println("Address: " + line.split(",",5)[4]);

            }

            else{
                FileReader file12 = new FileReader("Membership.txt");
                BufferedReader file23 = new BufferedReader(file12);
                String line1;
                while((line1=file23.readLine())!=null){
                    if(line1.contains(libraryusername)){

                        System.out.println("Username: " + line1.split(",",6)[0]);
                        System.out.println("Password: " + line1.split(",",6)[1]);
                        System.out.println("address: " + line1.split(",",6)[2]);
                        System.out.println("Date of Membership taken: " + line1.split(",",6)[3]);
                        System.out.println("age: " + line1.split(",",6)[4]);
                        System.out.println("ID: " + line1.split(",",6)[5]);

                    }


                }



            }

        }
        System.out.println("[1]Edit Profile");
        System.out.println("[2]Back");
        int choice = sc.nextInt();
        if(choice==1){
            Edit_Profile.edit_profile();
        }
        else if(choice==2){
            Library.library();
        }
        else{
            System.out.println("Invalid Input");
            viewuser_account();
        }







    }


}

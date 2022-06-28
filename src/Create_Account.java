import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Create_Account extends Main{
    static String[] array;
    static HashMap<String, String> map = new HashMap<>();

    public static void create() throws IOException {
        String ignore = sc.nextLine();
        Random.random();
        System.out.println("Username: ");
        String username = sc.nextLine();
        System.out.println("Password: ");
        String password = sc.nextLine();
        System.out.println("Age: ");
        int age = 0;
        boolean check = false;
        Take_Membership.getAge(check, sc.nextLine(), sc.nextInt());

//        String ignore1 = sc.nextLine();
        System.out.println("Address: ");
        String address = sc.nextLine();
        System.out.println("Account on "+username+" has been created successfully...");
        System.out.println("Your ID is "+ Random.b);
        String ID = String.valueOf(Random.b);
        String Username = username;

        FileWriter file1 = new FileWriter("USERNAME.txt",true);
        BufferedWriter file2 = new BufferedWriter(file1);
        PrintWriter file3 = new PrintWriter(file2);
        file3.println(username+","+password+","+ID+","+age+","+address);
        file3.close();
        FileReader file11 = new FileReader("USERNAME.txt");
        BufferedReader file22 = new BufferedReader(file11);
        String line;
        while((line=file22.readLine())!=null){
           array = line.split(",",5);


            map.put(array[0],array[1] );
            System.out.println(map);


        }
        Mainpage.mainpage();



    }

}

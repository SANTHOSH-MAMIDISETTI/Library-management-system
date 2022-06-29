import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Guest_Reader extends Main {
    static String[] array1;
    static String name;
    static String Phone_Number;
    static int pass = 0 ;
    static HashMap<String, String> map1 = new HashMap<>();

    public static void Guestreader() throws IOException {
        Scanner sc = new Scanner(System.in);
        Random.random();
        FileReader file24 = new FileReader("Login.txt");
        BufferedReader file25 = new BufferedReader(file24);
        String line1;
        String [] array1;
        List l1 = new ArrayList();
        while((line1=file25.readLine())!=null){
            array1 = line1.split(",",2);
            l1.add(array1[0]);

        }
        int numb = 0;
        while (numb == pass) {
            System.out.println("Username: ");
            name = sc.nextLine();
            if (name.equals("")) {
                System.out.println("\033[0;1m" + "Enter Username to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }

        pass = 0;
        if(!l1.contains(name)) {


            while (numb == pass) {
                System.out.println("Phone Number: ");
                Phone_Number = sc.nextLine();
                if (Phone_Number.equals("")) {
                    System.out.println("\033[0;1m" + "Enter Phone Number to continue \n" + "\u001B[0m");
                    pass = 0;
                } else {
                    pass = 1;
                }
            }


            System.out.println("Welcome " + name + ",\nAccount on your Name is created Temporarily (For 24Hours)\n");
            System.out.println("Your ID is " + Random.b);
            FileWriter file1 = new FileWriter("Login.txt", true);
            BufferedWriter file2 = new BufferedWriter(file1);
            PrintWriter file3 = new PrintWriter(file2);
            file3.println(name + "," + Phone_Number);
            file3.close();
            FileWriter file15 = new FileWriter("Login.txt", true);
            BufferedWriter file26 = new BufferedWriter(file15);
            PrintWriter file35 = new PrintWriter(file26);
            file35.println(name + "," + Phone_Number);
            file35.close();
            Mainpage.mainpage();

        }
        else{
            System.out.println("\033[0;1m" + "The username is aleady taken enter another one... \nPress Enter"+ "\u001B[0m");
            Guestreader();
        }
    }
}
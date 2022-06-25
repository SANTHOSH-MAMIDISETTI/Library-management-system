import java.util.Scanner;

public class Guest_Reader extends Main {
    public static void Guestreader() {
        Scanner sc = new Scanner(System.in);
        Random.random();
        System.out.println("Type your Name: ");
        String name = sc.nextLine();
        System.out.println("Type your Phone Number: ");
        String Phone_Number = sc.nextLine();
        System.out.println("Welcome " + name + ",\nAccount on your Name is created Temporarily (For 24Hours)\n");
        System.out.println("Your ID is " + Random.b);
    }
}
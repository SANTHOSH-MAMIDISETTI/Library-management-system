import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Create_Account extends Main{
    static Map<String, ArrayList<String>> multiValueMap = new HashMap<String, ArrayList<String> >();
    public static void create(){
        String ignore = sc.nextLine();
        Random.random();
        System.out.println("Username: ");
        String username = sc.nextLine();
        System.out.println("Password: ");
        String password = sc.nextLine();
        System.out.println("Age: ");
        int age = sc.nextInt();
        String Age=String.valueOf(age);
        String ignore1 = sc.nextLine();
        System.out.println("Address: ");
        String address = sc.nextLine();
        System.out.println("Account on "+username+" has been created successfully...");
        System.out.println("Your ID is "+ Random.b);
        String ID = String.valueOf(Random.b);
        String Username = username;

        multiValueMap.put(username, new ArrayList<String>());
        multiValueMap.get(username).add(Username);
        multiValueMap.get(username).add(password);
        Map<String, ArrayList<String>> multiValueMap1 = new HashMap<String, ArrayList<String> >();
        multiValueMap1.put(username, new ArrayList<String>());
        multiValueMap1.get(username).add(Username);
        multiValueMap1.get(username).add(ID);
        multiValueMap1.get(username).add(Age);
        multiValueMap1.get(username).add(address);
        System.out.println(multiValueMap.keySet());
        System.out.println(multiValueMap.get(username));
        System.out.println(multiValueMap1.get(username));
    }

}

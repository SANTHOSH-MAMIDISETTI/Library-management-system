public class Create_Account extends Main{
    public static void create(){
        Random.random();
        System.out.println("Username: ");
        String username = sc.nextLine();
        System.out.println("Password: ");
        String password = sc.nextLine();
        System.out.println("Age: ");
        int age = sc.nextInt();
        System.out.println("Address: ");
        String address = sc.nextLine();
        System.out.println("Account on "+username+" has been created successfully...");
        System.out.println("Your ID is "+ Random.b);
    }

}

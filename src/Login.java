import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Login extends Main{
    static int pass = 0;
    static String libraryusername;
    static String librarypassword;
    static String backkey = "03#";
    public static void login() throws IOException {
        Create_Account c = new Create_Account();
        String ignore = sc.nextLine();
        FileReader file11 = new FileReader("Login.txt");
        BufferedReader file22 = new BufferedReader(file11);
        int numb = 0;
        while (numb == pass) {
            System.out.println("Enter your Username: ");
            libraryusername = sc.nextLine();
            if (libraryusername.equals("")) {
                System.out.println("\033[0;1m" + "Enter Username to continue \n" + "\u001B[0m");
                pass = 0;
            } else {
                pass = 1;
            }
        }
        pass = 0;
        String line;
        List l = new ArrayList();

        HashMap<String, String> map = new HashMap<>();
        String[] arr;
        while((line=file22.readLine())!=null){
            arr = line.split(",",2);
            l.add(arr[0]);
            map.put(arr[0],arr[1]);
        }


        while (true) {
            while (numb == pass) {
                System.out.println("Enter your Password: (Enter 03# to exit to Mainpage...)");
                librarypassword = sc.nextLine();
                if (librarypassword.equals("")) {
                    System.out.println("\033[0;1m" + "Enter Password to continue \n" + "\u001B[0m");
                    pass = 0;
                } else {
                    pass = 1;
                }
            }
            pass=0;
            if (libraryusername.equals(backkey) || librarypassword.equals(backkey)) {
                Mainpage.mainpage();
            }
            String pass =  map.get(libraryusername);
            if (l.contains(libraryusername) && pass.equals(librarypassword)){
                Library.library();
            }
            else{
                wrong();
            }
            break;
        }
    }
    public static void wrong() throws IOException {
        System.out.println("\033[0;1m" + "Incorrect Credentials.... TryAgain \nPress Enter"+ "\u001B[0m");
        login();
    }
}
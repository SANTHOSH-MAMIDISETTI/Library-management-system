import java.io.*;

public class Edit_Address extends Login {
    public static void edit_address() throws IOException {
        System.out.println("ENTER YOUR NEW ADDRESS");
        String ignore = Main.sc.nextLine();
        String new_address = Main.sc.nextLine();
        FileReader file11 = new FileReader("USERNAME.txt");
        BufferedReader file22 = new BufferedReader(file11);
        String line;
        FileReader file12 = new FileReader("Membership.txt");
        BufferedReader file23 = new BufferedReader(file12);
        String line2;
        FileReader file24 = new FileReader("Login.txt");
        BufferedReader file25 = new BufferedReader(file24);
        String line3;
        while ((line = file22.readLine()) != null) {
            if (line.contains(libraryusername)) {
                String[] arr = line.split(",", 5);
                arr[4] = new_address;
                String new_line = arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4];
                FileWriter file02 = new FileWriter("USERNAME.txt", true);
                BufferedWriter file03 = new BufferedWriter(file02);
                file03.write(new_line);
                file03.close();
                remove_user.removeLineFromFile("USERNAME.txt", line);


            }

            else{
                while ((line2 = file23.readLine()) != null) {
                    if (line2.contains(libraryusername)) {
                        String[] arr = line2.split(",", 6);
                        arr[2] = new_address;
                        String new_line = arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + "," + arr[5];
                        FileWriter file62 = new FileWriter("Membership.txt", true);
                        BufferedWriter file63 = new BufferedWriter(file62);
                        file63.write(new_line);
                        file63.close();
                        remove_user.removeLineFromFile("Membership.txt", line2);
                    }

                }
            }

        }


    }
}

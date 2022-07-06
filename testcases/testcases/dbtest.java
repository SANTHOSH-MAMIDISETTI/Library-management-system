// package testcases;
// import java.sql.*;
// import java.util.HashMap;
// ;
// public class dbtest {
//     public static void main (String[]args) throws Exception {
//         HashMap hm = new HashMap<>();
//         String url = "jdbc:mysql://localhost:3306//neerajdb";
//         String username = "root";
//         String password = "12345678";
//         String query = "select * from engineering_books";
//         Class.forName("com.mysql.jdbc.Driver");
//         Connection connection = DriverManager.getConnection(url, username, password);
//         Statement st = connection.createStatement();
//         ResultSet rs = st.executeQuery(query);
//         while (rs.next()) {
//             hm.put(rs.getString("Title"), rs.getString("Author"), rs.getString("Publisher"), rs.getString("Year_"), rs.getString("Languages"), rs.getString("File_"));
//          }

//         System.out.println(hm);
//     }
// }
// , rs.getInt("Pages")
package testcases;
import java.sql.*;
import java.util.HashMap;

//import dnl.utils.text.table.TextTable;
//import net.proteanit.sql.DbUtils;
import java.util.Formatter;
public class dbtest {
    static String s;
static String s2;
    public static void main (String[]args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/neerajdb";
        String username = "root";
        String password = "12345678";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);
        String query = "SELECT * FROM neerajdb.engineering_books";
        Object query1 = "SELECT * FROM neerajdb.engineering_books";
        System.out.println("_______________________________________________");
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        Formatter fmt = new Formatter();
        s = String.format("%20s %20s %15s %20s %20s %15s","Name", "Author", "Pages", "Publisher", "Year", "File");
        System.out.println(s+"\n");
int i =0;
        while(i<30){

            String name = rs.getString(1);
            String Author = rs.getString(2);
            int Page = rs.getInt(6);
            String Page1=String.valueOf(Page);
            String Publisher = rs.getString(7);
            int year = rs.getInt(8);
            String year1=String.valueOf(year);
            String file = rs.getString(10);
            s2 = String.format("%20s %20s %11s %18s %15s %15s %15s",name, Author, Page1, "    ",Publisher, year1, file);
            rs.next();
            i = i+1;


            System.out.println(s2+"\n");
        }

//        while (rs.next()) {
////            int Year_ = rs.getInt("Year_");
////            String Title = rs.getString("Title");
////            String Author = rs.getString("Author");
////            int pages = rs.getInt("Pages");
////            String Publisher = rs.getString("Publisher");
////            String Language = rs.getString("Languages");
////            rs.next();
////            System.out.format("%s, %s, %s, %sn", Year_, Title,
////                    Author, pages);
//
//        }
// + " -> " + rs.getString(5)+

    }
}
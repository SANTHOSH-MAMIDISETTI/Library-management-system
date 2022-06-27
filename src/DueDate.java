import java.text.SimpleDateFormat;
import java.util.Calendar;
<<<<<<< HEAD
class DueDate extends Main {
    public static String dueDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar cal = Calendar.getInstance();
//        System.out.println("Current Date: "+sdf.format(cal.getTime()));
        cal.add(Calendar.DAY_OF_MONTH, 7);
        String newDate = sdf.format(cal.getTime());
        System.out.println("Your membership will expire after 30 days i.e on "+newDate);
        return newDate;
    }
}
=======
import java.text.ParseException;
import java.util.Date;

public class DueDate extends Main
{
    public static void  Duedate()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.DATE, 30);
        String output = sdf.format(c.getTime());
        System.out.println("Your Due Date is: " + output);
    }

    }
>>>>>>> origin/main

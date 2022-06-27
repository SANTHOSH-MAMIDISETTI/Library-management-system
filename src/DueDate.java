import java.text.SimpleDateFormat;
import java.util.Calendar;
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
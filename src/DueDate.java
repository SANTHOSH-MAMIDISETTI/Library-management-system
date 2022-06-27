import java.text.SimpleDateFormat;
import java.util.Calendar;
public class DueDate extends Main
        {
public static String DueDate()
        {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal=Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH,30);
        String newDate=sdf.format(cal.getTime());
        System.out.println("Membership valid upto : "+newDate);
        return newDate;
        }
        }
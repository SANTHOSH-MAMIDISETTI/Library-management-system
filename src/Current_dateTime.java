import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Current_dateTime extends Main
{
    public static Date current_dateTime()
    {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy            HH:mm:ss");
        String formatDateTime = now.format(formatter);
        System.out.println(formatDateTime);
        System.out.println("remove this line as well as the one below or above after running the program");
        Date today = new Date();
        System.out.println(today);
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        return today;
    }
}
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Current_dateTime extends Main
{
    public static void current_dateTime()
    {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy            HH:mm:ss");
        String formatDateTime = now.format(formatter);
        System.out.println(formatDateTime);
    }
}
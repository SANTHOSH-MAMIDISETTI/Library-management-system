import java.text.SimpleDateFormat;
import java.util.Calendar;
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
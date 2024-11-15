package paket;
import java.util.GregorianCalendar;

public class NewDate {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(1234567898765L);

        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1;
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Дата для 1234567898765L: " + year + "-" + month + "-" + day);
    }
}

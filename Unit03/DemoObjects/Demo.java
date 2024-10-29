import java.time.LocalDate;
import java.time.DayOfWeek;

public class Demo {
    public static void main(String[] args) {
        LocalDate rightNow = LocalDate.now();

        System.out.println("          " + rightNow.getMonth());
        System.out.println("MON TUE WED THU FRI SAT SUN");

        int dayOfMonth = rightNow.getDayOfMonth();
        LocalDate firstOfMonth = rightNow.minusDays(dayOfMonth - 1);
        System.out.println(firstOfMonth.getDayOfWeek());
        DayOfWeek firstDay = firstOfMonth.getDayOfWeek();
        LocalDate firstDayOfMonth = rightNow.minusDays(dayOfMonth - 1);

        System.out.println(firstDayOfMonth);

        if (firstDay == DayOfWeek.MONDAY) {

        } else if (firstDay == DayOfWeek.TUESDAY) {
            System.out.print("    ");
        } else if (firstDay == DayOfWeek.WEDNESDAY) {
            System.out.print("        ");
        } else if (firstDay == DayOfWeek.THURSDAY) {
            System.out.print("            ");
        } else if (firstDay == DayOfWeek.FRIDAY) {
            System.out.print("                ");
        } else if (firstDay == DayOfWeek.SATURDAY) {
            System.out.print("                    ");
        } else if (firstDay == DayOfWeek.SUNDAY) {
            System.out.print("                        ");
        }

    }
}
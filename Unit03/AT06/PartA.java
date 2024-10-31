/* Juan
 * 10/30/24
 * This program prints out a calender and prints an asterisk next to the current date
 */

import java.time.LocalDate;
import java.time.DayOfWeek;

public class PartA {
    public static void main(String[] args) {

        LocalDate rightNow = LocalDate.now();

        int today = rightNow.getDayOfMonth();

        LocalDate date = rightNow.plusDays(-today + 1);

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int dayNumber = dayOfWeek.getValue();

        System.out.println(" MON TUE WED THU FRI SAT SUN");
        System.out.println("-----------------------------");

        int currMonth = rightNow.getMonthValue();

        for (int i = 1; i < dayNumber; i++) {
            System.out.println("    ");
        }

        while (date.getMonthValue() == currMonth) {
            System.out.printf("%3d", date.getDayOfMonth());

            if (date.getDayOfMonth() == rightNow.getDayOfMonth()) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            if (dayNumber == 7) {
                System.out.println();
            }
            date = date.plusDays(1);
            dayOfWeek = date.getDayOfWeek();
            dayNumber = dayOfWeek.getValue();
        }
        System.out.println();
    }
}
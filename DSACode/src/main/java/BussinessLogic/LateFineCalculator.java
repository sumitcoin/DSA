package BussinessLogic;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LateFineCalculator {

    public static double calculateLateFine(String monthName, int graceDays, double finePerDay) {

        int currentYear = LocalDate.now().getYear();

        Month month = Month.valueOf(monthName.toUpperCase());

        // 1st day of month
        LocalDate firstDay = LocalDate.of(currentYear, month, 1);

        // fine start date
        LocalDate fineStartDate = firstDay.plusDays(graceDays);

        LocalDate today = LocalDate.now();

        if (today.isAfter(fineStartDate)) {

            long lateDays = ChronoUnit.DAYS.between(fineStartDate, today);

            return lateDays * finePerDay;
        }

        return 0;
    }

    public static void main(String[] args) {

        double fine = calculateLateFine("February", 10, 10);

        System.out.println("Late Fine: " + fine);
    }
}

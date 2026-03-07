package BussinessLogic;

import java.time.Month;
import java.util.LinkedHashMap;
import java.util.Map;

public class FeeQuarterGenerator {

    public static Map<String, String[]> getQuarters(String startMonthName) {

        Month startMonth = Month.valueOf(startMonthName.toUpperCase());

        Map<String, String[]> quarters = new LinkedHashMap<>();

        Month currentMonth = startMonth;

        for (int q = 1; q <= 4; q++) {

            String[] months = new String[3];

            for (int i = 0; i < 3; i++) {
                months[i] = currentMonth.name();
                currentMonth = currentMonth.plus(1);
            }

            quarters.put("Q" + q, months);
        }

        return quarters;
    }

    public static void main(String[] args) {

        Map<String, String[]> quarters = getQuarters("April");

        quarters.forEach((q, months) -> {
            System.out.print(q + " : ");
            for (String m : months) {
                System.out.print(m + " ");
            }
            System.out.println();
        });
    }
}

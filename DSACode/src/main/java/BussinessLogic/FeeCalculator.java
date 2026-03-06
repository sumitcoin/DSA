package BussinessLogic;

import bean.FeeStructure;

import java.time.Month;
import java.util.*;

public class FeeCalculator {

    public static Map<String, Map<String, Double>> generateMonthlyComponentFee(
            String startMonth,
            List<FeeStructure> feeStructures) {

        Map<String, Map<String, Double>> result = new LinkedHashMap<>();

        Month month = Month.valueOf(startMonth.toUpperCase());

        List<Month> months = new ArrayList<>();

        for (int i = 0; i < 12; i++) {
            months.add(month);
            month = month.plus(1);
        }

        for (int i = 0; i < months.size(); i++) {

            Month m = months.get(i);
            Map<String, Double> componentMap = new LinkedHashMap<>();

            for (FeeStructure fs : feeStructures) {

                switch (fs.getType().toLowerCase()) {

                    case "monthly":
                        componentMap.put(fs.getComponent(), fs.getAmount());
                        break;

                    case "yearly":
                        if (i == 0)
                            componentMap.put(fs.getComponent(), fs.getAmount());
                        break;

                    case "quarterly":
                        if (i % 3 == 0)
                            componentMap.put(fs.getComponent(), fs.getAmount());
                        break;
                }
            }

            result.put(m.name(), componentMap);
        }

        return result;
    }

    public static void main(String[] args) {

        List<FeeStructure> feeList = Arrays.asList(
                new FeeStructure("Tuition", "monthly", 5000),
                new FeeStructure("Computer", "monthly", 400),
                new FeeStructure("Lab", "yearly", 2000),
                new FeeStructure("Diary", "yearly", 100),
                new FeeStructure("Admission", "yearly", 20000),
                new FeeStructure("Exam Fee", "quarterly", 1500)
        );

        Map<String, Map<String, Double>> result =
                generateMonthlyComponentFee("April", feeList);

        result.forEach((month, components) -> {
            System.out.println("\n" + month);

            components.forEach((comp, amount) ->
                    System.out.println(comp + " : " + amount));
        });
    }
}

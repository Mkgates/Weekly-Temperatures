import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperatures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        System.out.println("Enter the average temperature for each day of the week:");
        for (String day : days) {
            System.out.print(day + ": ");
            double temp = scanner.nextDouble();
            temperatures.add(temp);
        }

        while (true) {
            System.out.println("\nType the name of a day to see its temperature, or type 'week' to see all temperatures and the weekly average:");
            String input = scanner.next().trim();

            if (input.equalsIgnoreCase("week")) {
                double total = 0;
                System.out.println("\nWeekly Temperatures:");
                for (int i = 0; i < days.size(); i++) {
                    System.out.println(days.get(i) + ": " + temperatures.get(i) + " degrees F");
                    total += temperatures.get(i);
                }
                double average = total / temperatures.size();
                System.out.printf("Weekly Average Temperature: %.2f degrees F%n", average);
                break;
            } else if (days.contains(input)) {
                int index = days.indexOf(input);
                System.out.println(input + "'s average temperature: " + temperatures.get(index) + " degrees F");
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }

        scanner.close();
    }
}



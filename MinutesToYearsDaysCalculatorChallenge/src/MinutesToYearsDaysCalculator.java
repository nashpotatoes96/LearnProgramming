public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        String output;
        if (minutes < 0) {
            output = "Invalid Value";
        } else {
            long days = minutes / (24 * 60);
            long years = days / 365;
            long remainingDays = days % 365;

            output = String.format("%01d", minutes) + " min = " +
                    String.format("%01d", years) + " y and " +
                    String.format("%01d", remainingDays) + " d";
        }

        System.out.println(output);
    }
}

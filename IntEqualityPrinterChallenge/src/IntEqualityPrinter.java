public class IntEqualityPrinter {

    public static void printEqual (int x, int y, int z) {
        String output;
        if (x < 0 || y < 0 || z < 0)
            output = "Invalid Value";
        else if (x == y && y == z)
            output = "All numbers are equal";
        else if (x != y && y != z && z != x)
            output = "All numbers are different";
        else
            output = "Neither all are equal or different";

        System.out.println(output);
    }
}

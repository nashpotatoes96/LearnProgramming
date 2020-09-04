public class DiagonalStar {

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 1; row <= number; row++) {
                String line = "";
                for (int col = 1; col <= number; col++) {
                    if (row == 1 || col == 1 || row == number || col == number) {
                        line += '*';
                    } else if (col == row) {
                        line += '*';
                    } else if (col == (number - row + 1)) {
                        line += '*';
                    } else {
                        line += ' ';
                    }
                }
                System.out.println(line);
            }
        }
    }
}

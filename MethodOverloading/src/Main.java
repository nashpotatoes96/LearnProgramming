public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Naish", 500);
        System.out.println("New score is " + newScore);
        int newAnonScore = calculateScore(69);
        System.out.println("New score is " + newAnonScore);
        calculateScore();

        calcFeetAndInchesToCentimeters(5, 9);
        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(-6, 4);
        calcFeetAndInchesToCentimeters(69);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score);
        return 1000 * score;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player Sscored " + score + " points");
        return 1000 * score;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet <0 || inches <0 || inches > 12) {
            System.out.println("Invalid value");
            return -1;
        }
        double centimeters = 2.54 * (inches + (12 * feet));
        System.out.println(feet + " feet and " + inches + " inches is " + centimeters);
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches <0) {
            System.out.println("Invalid negative value");
            return -1;
        }
        double feet = inches / 12;
        inches = inches % 12;
        return calcFeetAndInchesToCentimeters(feet, inches);
    }
}

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
        double inchInCentimeter = calcFeetAndInchesToCentimeters(69);
        System.out.println("69 inches is " + inchInCentimeter + " centimeters");
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

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid value");
            return -1;
        }
        System.out.println(feet + " feet and " + inches + " inches is " + calcFeetAndInchesToCentimeters(inches + (feet * 12)));
        return calcFeetAndInchesToCentimeters(inches + (feet * 12));
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0) {
            System.out.println("Invalid negative value");
            return -1;
        }
        return (2.54 * inches);
    }
}

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Naish", 500);
        System.out.println("New score is " + newScore);
        int newAnonScore = calculateScore(69);
        System.out.println("New score is " + newAnonScore);
        calculateScore();
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

    public static int calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0 && inches < 0 && inches > 12) {
            return -1;
        }
        return calcFeetAndInchesToCentimeters(inches + (feet * 12));
    }

    public static int calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0) {
            return -1;
        }
        return (int) (2.54 * inches);
    }
}

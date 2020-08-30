public class Main {

    public static void main(String[] args) {


        System.out.println("True = " + LastDigitChecker.hasSameLastDigit(11, 211, 541));
        System.out.println("False = " + LastDigitChecker.hasSameLastDigit(21, 101, 1001));
        System.out.println("False = " + LastDigitChecker.hasSameLastDigit(9, 679, 999));
        System.out.println("True = " + LastDigitChecker.hasSameLastDigit(10, 670, 1000));
    }
}

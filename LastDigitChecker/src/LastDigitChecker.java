public class LastDigitChecker {

    public static boolean hasSameLastDigit (int numberOne, int numberTwo, int numberThree) {

        if (!isValid(numberOne) || !isValid(numberTwo) || !isValid(numberThree))
            return false;

        if (numberOne % 10 == numberTwo % 10) {
            return true;
        } else if (numberTwo % 10 == numberThree % 10) {
            return true;
        } else if (numberOne % 10 == numberThree % 10) {
            return true;
        }

        return false;
    }

    public static boolean isValid(int nUT) {
        if (nUT >= 10 && nUT <= 1000)
            return true;

        return false;
    }

}

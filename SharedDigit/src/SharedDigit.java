public class SharedDigit {

    public static boolean hasSharedDigit (int numberOne, int numberTwo) {

        if (numberOne < 10 || numberOne > 99 || numberTwo < 10 || numberTwo > 99) {
            return false;
        }

        int numberOneC = numberOne;
        while (numberOneC > 0) {

            int numberTwoC = numberTwo;
            while (numberTwoC > 0) {

                if ((numberTwoC % 10) == (numberOneC % 10)) {
                    return true;
                }
                numberTwoC /= 10;
            }
            numberOneC /= 10;
        }

        return false;
    }
}

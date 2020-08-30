public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int numberOne, int numberTwo) {

        if (numberOne >= 10 && numberTwo >= 10) {

            int highest = Math.min(numberOne, numberTwo);

            for (int i = highest; i > 0; i--) {

                if ((numberOne % i == 0) && (numberTwo % i == 0))
                    return i;
            }
        }

        return -1;
    }
}

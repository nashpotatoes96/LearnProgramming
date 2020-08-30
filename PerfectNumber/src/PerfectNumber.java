public class PerfectNumber {

    public static boolean isPerfectNumber (int number) {

        if (number < 1) {
            return false;
        }

        int sumFactors = 0;
        for (int i = number/2; i >= 1; i--) {

            if ((number % i == 0) && i != number) {
                sumFactors += i;
            }
        }

        return sumFactors == number;
    }
}
public class SumDigits {

    public static int sumDigits (int number) {
        if (number < 10)
            return -1;

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int sumFirstAndLastDigit (int number) {

        if (number < 0)
            return -1;

        int last = number % 10;
        int first = 0;

        while (number > 0) {
            if (number < 10) {
                first = number;
            }
            number /= 10;
        }

        return last + first;
    }

    public static int getEvenDigitSum (int number) {
        if (number < 0)
            return -1;

        int sum = 0;
        while (number > 0) {
            int remainder = number % 10;
            if (remainder % 2 == 0) {
                sum += remainder;
            }
            number /= 10;
        }
        return sum;
    }
}

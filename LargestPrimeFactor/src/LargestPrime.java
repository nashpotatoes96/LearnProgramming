public class LargestPrime {

    public static int getLargestPrime (int number) {

        if (number < 1)
            return -1;

        for (int i = number; i > 1; i--) {
            if (number % i == 0) {
                boolean fatNope = false;
                for (int j = i - 1; j > 1; j--) {
                    if (i % j == 0) {
                        fatNope = true;
                    }
                }
                if (!fatNope) {
                    return i;
                }
            }
        }

        return -1;
    }
}

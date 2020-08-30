public class NumberToWords {

    public static void numberToWords (int number) {

        if (number < 0)
            System.out.println("Invalid Value");

        int digitCount = getDigitCount(number);
        number = reverse(number);


        while (digitCount > 0) {
            int digit = number % 10; number /= 10;

            String output;
            switch (digit) {
                case 0:
                    output = "Zero";
                    break;
                case 1:
                    output = "One";
                    break;
                case 2:
                    output = "Two";
                    break;
                case 3:
                    output = "Three";
                    break;
                case 4:
                    output = "Four";
                    break;
                case 5:
                    output = "Five";
                    break;
                case 6:
                    output = "Six";
                    break;
                case 7:
                    output = "Seven";
                    break;
                case 8:
                    output = "Eight";
                    break;
                case 9:
                    output = "Nine";
                    break;
                default:
                    output = "OTHER";
            }

            System.out.println(output);

            digitCount--;
        }
    }

    public static int reverse (int number) {
        int neg = 1; int reverse = 0;

        if (number < 0) {
            neg = -1; number *= -1;
        }

        for (int i = 0; number > 0; i++) {
            reverse *= 10; reverse += (number % 10); number /= 10;
        }

        return reverse * neg;
    }

    public static int getDigitCount (int number) {

        if (number >= 0) {

            int i = 0;
            while (number >= 0) {
                i++; number /= 10;

                if (number == 0)
                    break;
            }
            return i;
        }

        return -1;
    }
}

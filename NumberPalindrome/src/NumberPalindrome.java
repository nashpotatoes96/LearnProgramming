public class NumberPalindrome {

    public static boolean isPalindrome (int number) {

        int originalNumber = ((number < 0) ? -1 * number : number);

        int reverse = 0;
        number = originalNumber;
        while (number > 0) {
            reverse += number % 10;

            if (number >= 10) {
                reverse *= 10;
            }
            number /= 10;
        }

        return reverse == originalNumber;
    }
}

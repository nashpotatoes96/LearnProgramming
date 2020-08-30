public class Main {

    public static void main(String[] args) {

        System.out.println(NumberToWords.getDigitCount(0));
        System.out.println("998 = " + NumberToWords.reverse(998));
        System.out.println("-998 = " + NumberToWords.reverse(-998));

        NumberToWords.numberToWords(878);
        System.out.println("= 878");
        NumberToWords.numberToWords(100);
        System.out.println("= 100");

    }
}

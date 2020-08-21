public class Main {

    public static void main(String[] args) {

        System.out.println(SumDigits.sumDigits(125));
        System.out.println(SumDigits.sumDigits(1101));
        System.out.println(SumDigits.sumDigits(222));
        System.out.println(SumDigits.sumDigits(9));

        System.out.println("***********");

        System.out.println(SumDigits.sumFirstAndLastDigit(123));
        System.out.println(SumDigits.sumFirstAndLastDigit(1));
        System.out.println(SumDigits.sumFirstAndLastDigit(-123));
        System.out.println(SumDigits.sumFirstAndLastDigit(222));

        System.out.println("***********");

        System.out.println(SumDigits.getEvenDigitSum(123456789));
        System.out.println(SumDigits.getEvenDigitSum(252));
        System.out.println(SumDigits.getEvenDigitSum(-123456789));

    }
}

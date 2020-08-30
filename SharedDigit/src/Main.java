public class Main {

    public static void main(String[] args) {

        System.out.println("true = " + SharedDigit.hasSharedDigit(21, 23));
        System.out.println("false = " + SharedDigit.hasSharedDigit(1, 99));
        System.out.println("false = " + SharedDigit.hasSharedDigit(10, 100));
        System.out.println("false = " + SharedDigit.hasSharedDigit(10, 99));
        System.out.println("true = " + SharedDigit.hasSharedDigit(19, 99));
        System.out.println("false = " + SharedDigit.hasSharedDigit(43, 52));
        System.out.println("true = " + SharedDigit.hasSharedDigit(22, 12));

    }
}

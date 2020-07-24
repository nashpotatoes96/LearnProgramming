public class Main {

    public static void main(String[] args) {

        System.out.println(
                "-3.1756, -3.175 equal to three decimal places = " +
                DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756d, -3.175d)
        );
        System.out.println(
                "-3.176, -3.175 equal to three decimal places = " +
                        DecimalComparator.areEqualByThreeDecimalPlaces(-3.176d, -3.175d)
        );
        System.out.println(
                "3.0, 3.0 equal to three decimal places = " +
                        DecimalComparator.areEqualByThreeDecimalPlaces(3.0d, 3.0d)
        );
        System.out.println(
                "-3.123, 3.123 equal to three decimal places = " +
                        DecimalComparator.areEqualByThreeDecimalPlaces(-3.123d, 3.123d)
        );

    }
}

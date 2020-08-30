public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 1000000; i++) {
            if (PerfectNumber.isPerfectNumber(i))
                System.out.println(i + " isPerfect? = " + PerfectNumber.isPerfectNumber(i));
        }
    }
}

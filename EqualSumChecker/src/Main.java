public class Main {

    public static void main(String[] args) {

        System.out.println("1 + 1 = 1? " + EqualSumChecker.hasEqualSum(1,1,1));
        System.out.println("1 + 1 = 1? " + EqualSumChecker.hasEqualSum(1,1,2));
        System.out.println("1 + -1 = 1? " + EqualSumChecker.hasEqualSum(1,-1,0));
    }
}

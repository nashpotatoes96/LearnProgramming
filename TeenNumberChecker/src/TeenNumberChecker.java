public class TeenNumberChecker {

    public static boolean hasTeen(int x, int y, int z) {

        return (isTeen(x) || isTeen(y) || isTeen(z));
    }

    public static boolean isTeen(int i) {

        return (i > 12 && i < 20);
    }
}

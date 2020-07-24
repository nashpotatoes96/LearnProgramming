public class Main {

    public static void main(String[] args) {

        System.out.println("true, 1 = " + BarkingDog.shouldWakeUp(true, 1));
        System.out.println("false, 2 = " + BarkingDog.shouldWakeUp(false, 2));
        System.out.println("true, 8 = " + BarkingDog.shouldWakeUp(true, 8));
        System.out.println("true, -1 = " + BarkingDog.shouldWakeUp(true, -1));
    }
}

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (barking && (8 > hourOfDay || hourOfDay > 22) && (0 <= hourOfDay && hourOfDay < 24)) {
            return true;
        }

        return false;
    }
}

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int kiloBytesRemaining = (kiloBytes >= 1024) ?
                    kiloBytes % (megaBytes * 1024) : kiloBytes;

            System.out.println(kiloBytes + " KB = " +
                    megaBytes + " MB and " +
                    kiloBytesRemaining + " KB");
        }
    }
}

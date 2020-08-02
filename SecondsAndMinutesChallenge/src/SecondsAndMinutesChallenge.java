public class SecondsAndMinutesChallenge {

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds > 59 || seconds < 0) {
            return "Invalid value";
        }

        int hours = minutes / 60;
        int minutesRemaining = hours != 0 ? minutes % (hours * 60) : minutes;
        String time = String.format("%02d", hours) + "h " +
                String.format("%02d", minutesRemaining) + "m " +
                String.format("%02d", seconds) + "s";

        return time;
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        int minutes = seconds / 60;
        int secondsRemaining = minutes != 0 ? seconds % (minutes  * 60): seconds;

        return getDurationString(minutes, secondsRemaining);
    }
}

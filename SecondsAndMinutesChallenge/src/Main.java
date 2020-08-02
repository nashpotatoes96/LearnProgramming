public class Main {

    public static void main(String[] args) {

        String timeAsString =  SecondsAndMinutesChallenge.getDurationString(60, 30);
        System.out.println(timeAsString);
        timeAsString =  SecondsAndMinutesChallenge.getDurationString(64, 30);
        System.out.println(timeAsString);
        timeAsString =  SecondsAndMinutesChallenge.getDurationString(62);
        System.out.println(timeAsString);
        timeAsString =  SecondsAndMinutesChallenge.getDurationString(-1);
        System.out.println(timeAsString);
        timeAsString =  SecondsAndMinutesChallenge.getDurationString(62, 62);
        System.out.println(timeAsString);
    }
}

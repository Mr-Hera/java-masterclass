public class Hello {

    public static void main(String[] args) {

        System.out.println(getDurationString(3945));

    }

    public static String getDurationString(int seconds) {
//        1 minute = 60 seconds, 1 hour = 60 minutes || 3600 seconds

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int second = (seconds % 3600) % 60;

        return hours + "h " + getDurationString(minutes, second);
    }

    public static String getDurationString(int minutes, int seconds) {

        return minutes + "m " + seconds + "s";
    }

}

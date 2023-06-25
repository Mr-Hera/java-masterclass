public class Hello {

    public static void main(String[] args) {

        System.out.println(getDurationString(3945));
//        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 45));
//        System.out.println(getDurationString(65, 145));

    }

    public static String getDurationString(int seconds) {
//        1 minute = 60 seconds, 1 hour = 60 minutes || 3600 seconds

        if(seconds < 0) {
            return "Invalid input";
        }

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int second = (seconds % 3600) % 60;

        return hours + "h " + getDurationString(minutes, second);
    }

    public static String getDurationString(int minutes, int seconds) {


        if(((minutes < 0) || (minutes > 59)) || ((seconds < 0) || (seconds > 59))) {
            return "Invalid input";
        }

        String time = minutes + "m " + seconds + "s";

        return time;
    }

}

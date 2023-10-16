public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(65,-45));
        System.out.println(getDurationString(-65,-45));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }
    public static String getDurationString(int sec) {
        if(sec < 0){
            return "You entered invalid seconds (" + sec + "), must be positive integer value";
        }
        int minutes = sec / 60;
        int seconds = sec % 60;
        return getDurationString(minutes, seconds);
    }
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0){
            return "Invalid value for minutes ("+ minutes + "), must be positive value";
        }
        if(seconds >= 59 || seconds <= 0) {
            return "seconds ("+ seconds + ") must be between 0 and 59";
        }
        int hours = minutes / 60;
        int remMin = minutes % 60;
        return hours+"h "+remMin + "m " + seconds + "s";
    }
}

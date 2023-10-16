public class Main {
    public static void main(String[] args) {
//        System.out.println("New Score is "+calculateScore("Tim",500));
//        System.out.println("New Score is "+calculateScore(75));
//        calculateScore();
        System.out.println("5ft, 8in = "+ convertToCentimeters(5,8) + "cm");
        System.out.println("68in = "+convertToCentimeters(68)+"cm");
    }
//    public static int calculateScore(String playeraName, int score) {
//        System.out.println("Player "+ playeraName +" scored " + score + " points");
//        return score * 1000;
//    }
//    public static int calculateScore( int score) {
//        return calculateScore("Anonymous",score);
//    }
//    public static int calculateScore() {
//        System.out.println("No Player "+ "no player score" );
//        return 0;
//    }
    public static double convertToCentimeters(int height) {

        return height * 2.54;
    }
    public static double convertToCentimeters(int feet, int inches) {
        int totalInches = feet * 12 + inches;
        return convertToCentimeters(totalInches);
    }
}

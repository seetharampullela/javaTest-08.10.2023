public class Main {
    public static int calculateScore(boolean gameOver, int score, int levelCompleted,int bonus) {
        int finalScore = score;
        if(gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
    public static void main(String[] args) {
        int highScore = calculateScore(true, 10000,8, 100);
        System.out.println("The High score is "+highScore);
        calculateScore(true, 120,8, 200);

    }
}

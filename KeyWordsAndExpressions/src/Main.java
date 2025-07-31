public class Main {
    public static void main(String[] args) {
         boolean gameOver = true;
         int score = 800;
         int levelCompleted = 5;
         int bonus = 100;


         calculateScore(gameOver, levelCompleted, bonus, score);

        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;


        calculateScore(gameOver, newLevelCompleted, newBonus, newScore);


        calculateScore(true, 2, 10, 20);

    }

    public static void calculateScore(boolean over, int levCom, int bon, int scor) {


        int finalScore = scor;


        if(over == true){
            finalScore += levCom * bon;
            System.out.println("Your final Score is..: " + finalScore);
        }
    }
}

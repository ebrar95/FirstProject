package day11;

public class ScoreChecker {
    public static void main(String[] args) {
        int score = 50;
        if ( score < 0 || score > 100){
            System.out.println("INVALID SCORE!!!");
        }
       else if ( score == 100) {
            System.out.println("PERFECT SCORE");
        } else if (score >= 70 && score <100){
           System.out.println("YOU HAVE PASSED!");

        }
        else {
            System.out.println("YOU HAVE FAILED !!!!!");
        }
    }
}

package day08;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {
        /*
        * Voting Eligibility Program
        *
        * Create a variable age as int
        *
        * Check whether this age is more than or equal to 18
        * if yes print : you are ready to vote!!!
        * if less than 18 print wait until you are 18
        *
        */

        Scanner scan = new Scanner(System.in);
        int age = 13;

        if ( age >= 18) {
            System.out.println("You are ready to vote!!!");
        }
        else {
            System.out.println("Wait until you are 18");
        }

        int favouriteNumber = 1;

        if (favouriteNumber == 1) {
            System.out.println("BINGO!!!");
        }
        else {
            System.out.println("Try again later");

        }

    }
}

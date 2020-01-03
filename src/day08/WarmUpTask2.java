package day08;

import java.util.Scanner;

public class WarmUpTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        * Create a program to check your favorite your number
                * Create a variable called myFavoriteNumber as int
        * Ask user guessed right then print BINGO!!
                * if not print try again later

        */

        int favouriteNumber = 1;


        if (favouriteNumber == 1) {
            System.out.println("BINGO!!!");
        }
        else {
            System.out.println("Try again later");

        }

    }
}



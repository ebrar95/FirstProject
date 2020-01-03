package day10;

import java.util.Scanner;

public class practice {

    static class Main {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String item = scan.nextLine();

            //WRITE YOUR CODE HERE

            int price = 30;
            int purchase = 100;
            int balance = purchase - price;

            if (price < 100) {
                System.out.println("your current balance is: " + balance + "$");
            } else if (price > 100) {
                System.out.println("Sorry, not enough funds on your gift card!");
            } else {
                System.out.println("Invalid item item!");
            }
        }
    }
}
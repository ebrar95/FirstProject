package day19;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        // Homework

        // Create a program to
        // ask user two number and
        // add numbers within those range

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers here: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sum = 0;
        for (int x = num1; x <= num2; x++) {
            sum = sum + x;
        }
        System.out.println(sum);
    }
}


package day05;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {

         /*
         Task 3:
    Create an interactive program to ask user for day
    and generate minute that day has
     */
         /*
         Task 4:
         Create an interactive program to ask user for hourly wage
         and generate yearly salary
         assume that he works 2080 hour for a year
          */

         /*
         Task 5:
         ask user whats the price of tomato and store it
         ask user how many tomato you want to buy and store it
         ask user what is the price of potato and store it
         ask user how many potato you want to buy and store it
    *   ask user whats the price of banana and store it
        ask user how many banana you want to buy and store it

        generate this example output
        You got 3 tomato price is 2.99 and total -->>
        You got 5 potato price is 3.49 and total -->>
        You got 2 banana price is 1.99 and total -->>

        Your grand total for this shopping is ????



          */
        // Task 3

         Scanner scan = new Scanner(System.in);
        System.out.println(" What is the day in minutes ? "  );
         int days = scan.nextInt();
         int minutes = ( days * 60);

         System.out.println( "There are " + minutes + " minutes" + " in " + days + " days");








    }


}

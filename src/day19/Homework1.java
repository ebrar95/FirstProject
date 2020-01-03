package day19;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        //  HOMEWORK
        // CREATE AN INTERACTIVE PROGRAM TO ASK USER
        // STARTING CHARACTER AND ENDING CHARACTER
        // THEN PRINT EVERYTHING IN BETWEEN
        // IT COULD BE STARTING CHARACTER IS AFTER ENDING CHARACTER
        // FOR EXAMPLE USER CAN ENTER  Z A  , or A K
        // Can we ask user character ? NO!!!!
        // Ask user for String and pick first character by charAt(0)

       Scanner scan = new Scanner(System.in);
       System.out.println("Enter two characters here: ");
       String word1 = scan.next();
       String word2= scan.next();

       char charword1 = word1.charAt(0);
       char charword2 = word2.charAt(0);

          if ( charword1>charword2 ) {
            System.out.println("Character needs to decrease");

            for (char i = charword1; i >= charword2; --i) {
                System.out.print(i + ", ");
            }
        } else if ( charword2>charword1){
              System.out.println("Character needs to increase");
              for ( char x = charword1; x <= charword2; ++x){
                  System.out.print(x + ", ");
              }
          } else {
              System.out.println("The Characters are same");
          }



    }
}

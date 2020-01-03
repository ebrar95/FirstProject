package day06;

import java.util.Scanner;

public class UsingTheValueOfOtherVariables {

    public static void main(String[] args) {

        int myFavoriteNumber = 300 ;
        int yourFavoriteNumber = myFavoriteNumber ;


        System.out.println("My Favorite Number " + myFavoriteNumber   );
        System.out.println("Your Favorite Number " + yourFavoriteNumber   );

        yourFavoriteNumber = 100 ;
        System.out.println("My Favorite Number " + myFavoriteNumber   );
        System.out.println("Your Favorite Number " + yourFavoriteNumber   );

        // Create variable called yourOrder , type String and assign a value
        //and assign a value
        // Create another variable called myOrder and assign the valur
        // to same value as yourOrder by copying
        // and just print them out

        Scanner input = new Scanner(System.in) ;
        System.out.println("WHAT iS YOUR ORDER ? I WANT THE SAME!");
        String yourOrder = input.nextLine() ;
        String myOrder = yourOrder ;

        System.out.println("Your order is " + yourOrder+ "\n" + "My order is " + myOrder) ;











    }
}

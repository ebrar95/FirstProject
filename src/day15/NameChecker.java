package day15;

import java.util.Scanner;

public class NameChecker {
    public static void main(String[] args) {
       /* Task 1 :
        Name checker :
        Declare a variable to store your name
        check whether you name length is less than 4
        if so print short Name
        if it is within 5-10
        if so print medium Name
        if it's more than 11
        print longer name
                ------------------------------
        check whether your name has either character a or e
        if so -->> name contains a or e
        if not -->> i dont have both a or e in my name

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name please");
       String name = scan.next();
       int lengthOfTheName = name.length();
        System.out.println("lengthOfTheName = " + lengthOfTheName);
        if ( lengthOfTheName < 4){
            System.out.println("short Name");

        } else if (lengthOfTheName >= 4 && lengthOfTheName <=11){
        System.out.println("medium Name");

    } else {
            System.out.println("longer name");
        }
     //-----------------------
        if(name.contains("a") || name.contains("e")){
            System.out.println(" name contains a or e ");
        } else {
            System.out.println(" i don't have both a or e in my name ");
        }
    }
}

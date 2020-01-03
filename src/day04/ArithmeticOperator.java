package day04;

import javax.swing.*;

public class ArithmeticOperator {
    public static void main(String[] args) {

        // arithmetic operator between two int ---> another int

 //       System.out.println( 5 + 3 ) ; // 8
 //       System.out.println( 5 - 3 ) ; // 2
 //       System.out.println( 5 * 3 ) ; // 15
 //       System.out.println( 5 / 3 ) ; // 1

        // arithmetic operator between two numerical data type
        // the final result will be larger data type
        System.out.println( 5 + 3.0d ) ; // 8
        System.out.println( 5 - 3.0d ) ; // 2
        System.out.println( 5 * 3.0d ) ; // 15
        System.out.println( 5 / 3.0f ) ; // 1


        // store above numbers in variables
        // and replace above statements with variables instead
        // dataType result1= the calculation here
        // System.out/println(result1);

   //     double num = 3.0d ;
   //     float num2 = 3.0f ;
   //     int result1 = 8 ;
   //     int result2 = 2 ;
   //     int result3 = 15 ;
   //     float result4 = 1.6666f ;

   //     System.out.println("5" + "+" + num + "=" + result1) ;
   //     System.out.println("5" + "-" + num + "=" + result2) ;
   //     System.out.println("5" + "*" + num + "=" + result3) ;
   //     System.out.println("5" + "/" + num2 + "=" + result4) ;

        //Akbar's way

        int num1 = 5 ;
        double num2 = 3.0d ;
        float num3 = 3.0f ;

        double result1 = num1 + num2;
        double result2 = num1 - num2;
        double result3 = num1 * num2;
        double result4 = num1 / num2;
        float result5 =  num1 / num3;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);














    }
}

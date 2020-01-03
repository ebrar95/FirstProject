package day05;

public class VariablePractice {
    public static void main(String[] args) {

        // 8 primitive
        /* line1
         line2
         line3
         Block comment, everything in between will be seen as comment

         whole numbers : byte, short, int, double, long
         fractional numbers: float , double
         logical  : boolean (true, false)
         character: char (single character in single quote)

         usually by default for whole numbers : just use int
         usually by default for fractional numbers : just use double


         IS String part of Primitive types?: NOOOO!
         String is sequence of character

        */
        // Task 1: age calculator
        // given birth year, please calculate age
        int birthYear = 1995;
        int currentYear = 2019;
        int age = currentYear - birthYear ;
        // I was born in 1995 , and i am 25 years old ;

       // System.out.println("I was born in year " +  1995 +  " , and I am" + (2019-1995) + "years old");
        System.out.println("I was born in year " + birthYear + " , and I am " + age + " years old" );

        // Task 2 : you are speeding today
        // speed limit is some number, and your current speed is this
        //generate this output of: You are driving 10 mph more than speed limit
        // speedLimit is int , currentSpeed as int , overTheLimit as int
        int speedLimit = 75 ;
        int currentSpeed = 80 ;
        int overLimit = currentSpeed - speedLimit ;
        System.out.println("The current speed is  " + currentSpeed + "  mph , "  + " the Speed limit is " + speedLimit + " mph , " +  "I am over " + overLimit + " mph ");




    }
}

package day10;

public class Answer {
    public static void main(String[] args) {

        //Create a variable called myAnswer as String with value of empty string
        //Create a variable called myNumber and assign any value
        //If the number can be divided by 5 without remainder
       // Assign myAnswer value to Fizz Number
        //If not assign the value to not a Fizz Number
       // Outside if else statement :
       // print my number is <> , It is  <value of myAnswer here>




        String myAnswer = "";
        int myNumber = 6;

        if ( myNumber%5==0) {
            myAnswer = "Fizz Number" ;
            System.out.println( "My number is " + myNumber +"," + " It is a " + myAnswer);
        }
        else {
            myAnswer = "Not a Fizz Number";
            System.out.println("My number is " + myNumber +"," + " It is " + myAnswer);
        }


    }
}


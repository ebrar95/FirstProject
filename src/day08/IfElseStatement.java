package day08;

public class IfElseStatement {
    public static void main(String[] args) {
         int speedLimit = 60;
         int yourCurrentSpeed = 45;

         // if the yourCurrentSpeed is more than speed limit
        // get pulled over by the police
        // given ticket by the police
        //taken away some points on your license
        // go to court

        boolean IamSpeeding = ( yourCurrentSpeed > speedLimit ) ;
        // INSIDE THE PARENTHESIS WE CAN ONLY PUT
        // BOOLEAN VARIABLE
        // ANY EXPRESSION THAT RETURN BOOLEAN VALUE
        // if ( IamSpeeding ) {
        // if ( true ) {
         if ( yourCurrentSpeed > speedLimit) {
            System.out.println("get pulled over by the police");
            System.out.println("given ticket by the police");
            System.out.println("taken away some points on your license");
            System.out.println("go to court");

        } else {
            System.out.println("go shopping !!");
            System.out.println("buy icecream");
            System.out.println("enjoy your day!");
        }
        System.out.println("THE END");

        // if not over the limit
        // go shopping !!

        // outside if statement, say the end

    }
}

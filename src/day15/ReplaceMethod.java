package day15;

public class ReplaceMethod {
    public static void main(String[] args) {
        // replace method of String
        // It will go through all part of String and replace
        // any match with the new String
        String message = "I love Pumpkin , Pumpkin is FUN!";
       message = message.replace("Pumpkin", "Java!" );
        System.out.println(message);
        String message2 = "Happy Thanks Giving to ALL!!";
        //"Happy Thanks Giving to All!!"---->>"Happy Thanksgiving to All!!"

      message2 = message2.replace("Thanks Giving" , "Thanksgiving");
        System.out.println("message2 = " + message2);
        // remove all the space
        message2 = message2.replace(" ", "");
        System.out.println("message2 = " + message2);

        // how do we remove NO!
        String message3= "TOMORROW IS OFF NO!";
        message3=message3.replace(" NO", "");
        System.out.println("message3 = " + message3);

    }
}

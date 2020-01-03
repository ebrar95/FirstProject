package day10;

public class MultiBranch_WithSwitch {
    public static void main(String[] args) {


        //At the Mcdonald Drive thru
        System.out.println("Welcome to McDonald , what can I get for you");
        /*
        11, Burger
        5, French Fry
        8, Nuggets
        35, Ice Cream
        55, Coke
         */
        String order = "";
        int itemNumber = 35;
       switch (itemNumber){
           case 11:
      System.out.println("You have selected 11");
      order = "Burger";
      break;

           case 5 :
            System.out.println("You have selected 5");
            order = "French Fry";
        break;
           case 8 :
            System.out.println("You have selected 8");
            order = "Nuggets";
            break;

        case 35 :
            System.out.println("You have selected 35");
            System.out.println("YAY!!!YUMM!!");
            System.out.println("ENJOYYYY!!!");
            order = "Ice Cream";
            break;

           default :
            System.out.println("YOU HAVE SELECTED UNKNOWN NUMBER@!!");
            order = "Unkown";
            break;
        }

        System.out.println("Your order is " + order);
    }

}
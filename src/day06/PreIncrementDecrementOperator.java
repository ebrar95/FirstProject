package day06;

public class PreIncrementDecrementOperator {
    public static void main(String[] args) {

        // initializing(giving value ) offerCount value to 2
        int offerCount = 2;
        // increasing the number by one using normal way ;
        offerCount = offerCount + 1 ;
        // this is increasing the value by one using compound/shorthand operator
        offerCount +=1 ;
        // Since increasing or decreasing a value is very special
        // and often used in programming
        // There is even shorter shortcut for this operation
        // and we can use ++ or -- , THIS IS EXCLUSIVELY FOR INCREASING OR DECREASING BY 1
        // We can NOT use it for any other time like increasing or decreasing value more than one.

        // ++ offerCount; ---? this is the same as offerCount +=1 ; and this offerCount = offerCount + 1 ; it's just shorter
        System.out.println("Offer Now " + offerCount );

        --offerCount ;
        System.out.println("Offer Now after decreasing one " + offerCount);


    }
}

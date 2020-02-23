package day58;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Checked Exception in next line");

        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("Exception was caught");
        }

        System.out.println("After Thread.sleep");
    }
}
// This is HANDLING Exceptions.
// If there is an exception it will go through catch,  if not it will skip to the last step.
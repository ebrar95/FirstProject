package day05;

import java.util.Scanner;

public class WageConverter {
    public static void main(String[] args) {
 /*
         Task 4:
         Create an interactive program to ask user for hourly wage
         and generate yearly salary
         assume that he works 2080 hour for a year
          */

        Scanner scan = new Scanner(System.in);
        System.out.println( "What is your hourly salary ? ");
        double hourlySalary = scan.nextDouble();
        double yearlyWage = ( hourlySalary * 2080 ) ;

        System.out.println(" Your yearly wage is " + yearlyWage + " according to your hourly salary of " + hourlySalary);




    }
}

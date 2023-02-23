package practice01;
/*
     Take a number from user and,
        i)Check if it is less than 0. If it is less than zero, print "Negative Number" on console.
        ii)If it is greater than or equals to zero, check if it is less than 10. If it is less than 10, print "Positive Digit" on console,
        and if it is greater than or equals to 10 print "Positive Number" on console.
     */

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
                int x = scan.nextInt();

        if (x < 0){
            System.out.println("Negative Number");
        }

        else {
            if (x <10){
                System.out.println("Positive Digit");
            }
            else {
                System.out.println("Positive Number");
            }
        }



    }
}

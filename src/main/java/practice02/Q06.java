package practice02;

import java.util.Locale;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //Ask user to enter a String and count the number of 'a's come earlier than first occurrence of 'c'.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.nextLine().toLowerCase();
        int counter = 0;

        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)=='a') {
                counter++;
            }else if (str.charAt(i)=='c'){
                    break;
            }
        }
        System.out.println("Number of 'a' before 'c' : " +counter);


    }



}

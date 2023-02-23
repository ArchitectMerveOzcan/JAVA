package practice02;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

        /*
        Ask user to enter two words. If the number of characters of the first word is even,
        then put the second word into the middle of the first word.
        If the number of characters of second word is odd, then print on console
        "You can not put second word into the middle of the first word. Because it's number of character is odd.".
         */

      Scanner input=new Scanner(System.in);
        System.out.println("Enter 1st word");
        String word1 = input.next();

        System.out.println("Enter 2nd word");
        String word2 = input.next();

        if (word1.length()%2 == 0){
            String str1 = word1.substring(0,word1.length()/2);
            System.out.println(str1);

            String str2 = word1.substring(word1.length()/2,word1.length());
            System.out.println(str2);

            System.out.println(str1 + word2 + str2);

        }else{
            System.out.println("You can not put second word into the middle of the first word. Because it's number of character is odd.");
        }



        }
    }
package practice00;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1Assignment {

    /*- Type code to ask user to enter the int elements and add elements into the list
        - Ask user to enter the elements to remove, then remove that element from list.
        - Ask user to enter the element to update, then update it.

     */
    public static void main(String[] args) {


        List myList = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of List?");
        int sizeList = input.nextInt();
        for (int i = 0; i < sizeList; i++) {
            System.out.println("Enter an integer");
            myList.add(input.nextInt());
        }

        System.out.println(myList);

        System.out.println("How many elements will you remove from list?");
        int sizeOfRemove = input.nextInt();
        for (int i = 0; i < sizeOfRemove; i++) {

            System.out.println("Enter an integer to remove");
            int a = input.nextInt();

            if (myList.contains(a)) {
                myList.remove(myList.indexOf(a));
            } else {
                System.out.println("The integer is not in your list");
            }
        }

        System.out.println(myList);

        System.out.println("How many elements will you update from list?");
        int sizeOfUpdate = input.nextInt();

        for (int i = 0; i < sizeOfUpdate; i++) {

            System.out.println("Enter an integer to update");
            int b = input.nextInt();

            if (myList.contains(b)) {
                System.out.println("Enter updated integer");
                int c = input.nextInt();
                myList.set(myList.indexOf(b), c);
            } else {
                System.out.println("The integer is not in your list");
            }
        }
        System.out.println(myList);
    }
}
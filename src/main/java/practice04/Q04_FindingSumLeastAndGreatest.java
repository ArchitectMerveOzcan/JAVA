package practice04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q04_FindingSumLeastAndGreatest {
    public static void main(String[] args) {

       /*
       Find the sum of the least and the greatest price given in a String List.
       Example: List<String> myList= new List<String>{"$12.99", "$8.25", "$23.60", "$54.45"}; ==> 62.70
        */

        List<String> myList = Arrays.asList("$12.99", "$8.25", "$23.60", "$54.45");
        System.out.println(myList);

        List<Double> doubleList = new ArrayList<>();

        for (String w : myList){
            double price = Double.valueOf(w.replace("$", ""));
            doubleList.add(price);
        }

        Collections.sort(doubleList);
        System.out.println(doubleList);

        double sum = doubleList.get(0) + doubleList.get(doubleList.size()-1);

        System.out.println(sum);




    }
}

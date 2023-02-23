package practice04;

import java.util.Arrays;
import java.util.List;

public class Q2_ConvertingEleInAList {
    public static void main(String[] args) {

        /*
        If the list has 15 as element, change all 15s to 51
        Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)

         */
        //3.Way to create List object

        List<Integer> list = Arrays.asList(12, 11, 15, 34, 43);
        System.out.println(list);

        if (list.contains(15)){

            list.set(list.indexOf(15), 51);
            System.out.println(list);
        }else {
            System.out.println("List does not contain the expected element");
        }

    }

}

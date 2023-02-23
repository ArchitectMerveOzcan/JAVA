package practice04;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q03_FindingEleInMiddle {
    public static void main(String[] args) {

         /*
        Find the middle element in an integer array
       Example 1: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
       (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
    */

        int [] arr = {12, 5, 8, 13, 15, 21, 50};

        Arrays.sort(arr);
        int middleIdx = arr.length/2;
        System.out.println(middleIdx);
        System.out.println(Arrays.toString(arr));

        if (arr.length % 2 != 0){
            System.out.println(arr[middleIdx]);

        }else{
            double middle = (arr[middleIdx] + arr[middleIdx-1])/2;
            System.out.println(middle);
        }


        //2.Way

        List<Integer> x = Arrays.asList(12, 5, 8, 13, 21, 50);
        System.out.println(x);

        Collections.sort(x);
        System.out.println(x);

        int sizeOfX =x.size();
        int middleX = sizeOfX/2;

        System.out.println(middleX);

        if (sizeOfX % 2 != 0){

            System.out.println(x.get(middleX));

        }else{

            System.out.println((x.get(middleX) + x.get(middleX-1))/2);
        }



         }


    }


package day27exceptionscollections;

import java.util.LinkedList;

public class LinkedListHomework {

    public static void main(String[] args) {

        //Example 2: If the number of characters is more than 4, remove them from the Link List

        LinkedList<String> names = new LinkedList<>();

        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");

        //1.Way:

        LinkedList<String> removeList = new LinkedList<>();

        for(String w: names){
            if(w.length()>4){
                removeList.add(w);
            }
        }
        names.removeAll(removeList);
        System.out.println(names);

        //2.Way:

        for(int i=0; i<names.size(); i++){
            if(names.get(i).length()>4){
                names.remove(names.get(i));
                i--;
            }
        }
        System.out.println(names);












    }



}

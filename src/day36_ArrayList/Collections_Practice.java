package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Practice {
    /*
     {30,20, 40, 50, 15};
     output: 50 40 30 20 15
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(30,20, 40, 50, 15));

        Collections.sort(list);

        System.out.println(list);


        ArrayList<Integer> descending = new ArrayList<>();

        for (int i = list.size()-1;i>=0; i--){
            descending.add(list.get(i));
        }

        System.out.println(descending);
    }

}
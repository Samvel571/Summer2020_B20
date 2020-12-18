package practice.InterviewTasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RemoveDuplicates_ArrayList {

    //* Create a method will take an Integer ArrayList and remove any duplicates values. Return an ArrayList of unique elements.


    public static ArrayList<Integer> removeDups(ArrayList<Integer> list){

      list.removeIf(p->Collections.frequency(list,p) >1);


        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = RemoveDuplicates_ArrayList.removeDups(
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 3, 2, 1, 4, 5, 6, 7, 8, 9, 9)));

        System.out.println(list);


    }
}

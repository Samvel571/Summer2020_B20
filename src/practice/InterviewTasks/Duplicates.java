package practice.InterviewTasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Duplicates {

//Create a method will take an Integer ArrayList and remove any duplicates values. Return an ArrayList of unique elements.



    public static ArrayList<Integer> removeDup(ArrayList<Integer> nums){

        ArrayList<Integer> uniquesValues = new ArrayList<>();

       for (int each : nums){

           if (!uniquesValues.contains(each))
               uniquesValues.add(each);
       }

        return uniquesValues;

    }


    public static ArrayList<Integer> removeDup2(ArrayList<Integer> nums){

        return  new ArrayList<>(new LinkedHashSet<>(nums));
    }


    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,4,5,6,7,8,9,33,2,5,6,7,8,97,6));
        System.out.println(Duplicates.removeDup(list));

        System.out.println("==================================");

        System.out.println(Duplicates.removeDup2(list));


    }

}

package day36_ArrayList;
/*
 1. write a program that can find the unique characters from a string
                DO NOT use nested loop
                "ABABCDEE"
                output: C D

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task {
    public static void main(String[] args) {


        String str = "ABABCDEE";
        String[] arr = str.split("");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        for (String each : arr) {
            if (Collections.frequency(list, each) == 1) {
                System.out.print(each + " ");
            }
        }

        System.out.println("=============================================================");

        /*
         TASK2. write a program that can find the frequency of character from a String
                DO NOT use nested loop
                "AABBCCDDEE"  ==> "ABCDE"
                output: A2B2C2D2E2

         */

        String str1 = "AABBCCDDEE";
        String[] arr1 = str1.split("");

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr1));
        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
             if (!list2.contains(list1.get(i))) {
                 list2.add(list1.get(i));

            }
        }

        ArrayList<String> results = new ArrayList<>();

        for (String each : list2) {
            int count = Collections.frequency(list1,each);
            System.out.print(each+count);
        }
    }

    }

package practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class replit {


    public static void main(String[] args) {
        String one = "12345";
        String two = "abcdefghij";


        String results = "";

        String longer = "";
        String shorter = "";
        int shortestStrLength = 0;

        if (one.length() > two.length()) {
            longer = one;
            shorter = two;
            shortestStrLength = two.length();
        } else {
            longer = two;
            shorter = one;
            shortestStrLength = one.length();
        }


        for (int i = 0; i < shortestStrLength; i++) {
            results += "" + one.charAt(i) + two.charAt(i);
        }

        results += longer.substring(shortestStrLength);


        // System.out.println(results);


        String email = "";


        String[] arr = {"apple", "banana","kiwi", "grape","milk","soda"};
       int k =1;
       int j =2;
        for (int i = 0; i <arr.length; i++) {

            if (i < arr.length - 2) {

                System.out.println(arr[i] + ", " + arr[k] + ", " + arr[j]);
                k++;
                j++;
            }
        }


        }



      //  System.out.println(Arrays.toString(arr));

    }










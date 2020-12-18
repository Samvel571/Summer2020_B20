package practice.InterviewTasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountDupForAmazon {

/*[ Amazon 1st round question]

* Write a program to identify the frequency of duplicates words in a string. Print duplicates words and their frequency.

    *->input "java is a java language is useful java
    * -> output:
    * java: 3
    * is :2
    * language: 1
    * useful: 1


*/

    public static void countDups(String s){

        // converting string to Arraylist
        ArrayList<String> words = new ArrayList<>(Arrays.asList(s.split(" ")));
        String checked = "";


        for (String eachWord : words){
           if (!checked.contains(eachWord)) {
               int frequencyOfEach = Collections.frequency(words, eachWord);//ready method
               System.out.println(eachWord + ": " + frequencyOfEach);
               checked += eachWord + " ";
           }
        }




    }

    public static void main(String[] args) {
        countDups("java is a java language is useful java");
    }

}

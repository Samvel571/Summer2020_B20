package practice.InterviewTasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PracticeAirplane {
    /*
    /*[ Amazon 1st round question]

* Write a program to identify the frequency of duplicates words in a string. Print duplicates words and their frequency.

    *->input "java is a java language is useful java
    * -> output:
    * java: 3
    * is :2
    * language: 1
    * useful: 1

/*

     */


    public static  void countDups( String s){

        ArrayList<String> allWordsInString = new ArrayList<>();
        allWordsInString.addAll(Arrays.asList(s.split(" ")));

        String  checkedWords = "";

        for (String each : allWordsInString){
            if (!checkedWords.contains(each)){
                int frequencyOfEach = Collections.frequency(allWordsInString,each);
                System.out.println(each+": "+frequencyOfEach);
                checkedWords += each +" ";

            }
        }


    }


    public static void main(String[] args) {
     countDups("java is a java language is useful java");
    }

}

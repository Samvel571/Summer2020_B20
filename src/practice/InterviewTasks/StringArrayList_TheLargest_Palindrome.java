package practice.InterviewTasks;

import java.util.ArrayList;

public class StringArrayList_TheLargest_Palindrome {

//* Create a method that will accept a String ArrayList and return the largest Palindrome String from it
//    => Assume there is no Strings with the same length and there will be at least one element


    public static String largestPalindrome(ArrayList<String> words){


        String largestStr ="";
        for (String eachWord : words){
            if (eachWord.length() > largestStr.length()){
                if (isPalindrome(eachWord)) {
                    largestStr = eachWord;
                }
            }

        }
        return largestStr;
    }

    private static boolean isPalindrome(String str){

        for (int i =0; i < str.length() / 2; i++){
            if (str.charAt(i) !=  str.charAt(str.length()-1-i) ){
                return false;
            }
        }

        return true;
    }

}

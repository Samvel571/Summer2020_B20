package practice;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {


        System.out.println( isAnagram("list   e N","SiL Ent") );



    }

    public static boolean isAnagram(String word1, String word2) {
        String[] arr1 = word1.replace(" ", "").toLowerCase().split("");
        String[] arr2 = word2.replace(" ", "").toLowerCase().split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);

    }
}

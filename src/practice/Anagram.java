package practice;

import java.util.Arrays;
import java.util.Random;

public class Anagram {

    public static void main(String[] args) {




        //int a;

        //System.out.println( isAnagram("list   e N","SiL Ent") );



        // Generate random integers in range 0 to 999
        for(int i=0; i<10; i++) {
            Random rand = new Random();
            int rand_int1 = rand.nextInt(7);
            System.out.println(rand_int1);
        }
    }

    public static boolean isAnagram(String word1, String word2) {
        String[] arr1 = word1.replace(" ", "").toLowerCase().split("");
        String[] arr2 = word2.replace(" ", "").toLowerCase().split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);

    }
}

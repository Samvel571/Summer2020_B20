package practice;

import java.util.Arrays;

public class ReverseSentence {

    public static void main(String[] args) {


        String sentence = "My name is Rajmi";

         //0    1    2    3
        //[My, name, is, Rajmi]
        String[] arr = sentence.split(" ");

       // System.out.println(Arrays.toString(arr) );
        // 0    1   2     3
        String[] reverse = new String[arr.length];

        int k =0;
        for (int i = arr.length-1; i >=0 ; i --){
                 reverse[k]  =  arr[i];
                 k++;
        }

        System.out.println(Arrays.toString(reverse));

    }
}

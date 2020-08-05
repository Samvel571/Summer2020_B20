package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class replit {


    public static void main(String[] args) {
        String one = "12345";
        String two = "abcdefghij";


        String results ="";

        String longer ="";
        String shorter ="";
        int shortestStrLength =0;

        if (one.length()>two.length()){
            longer = one;
            shorter = two;
            shortestStrLength =two.length();
        }else {
            longer =two;
            shorter =one;
            shortestStrLength =one.length();
        }


        for (int i = 0; i < shortestStrLength;i++){
            results += ""+one.charAt(i)+two.charAt(i);
        }

            results += longer.substring(shortestStrLength);


        System.out.println(results);





        int num = 80;

        while(num >= 20){

            System.out.print(num+" ");
            num -=2;
        }
    }


}


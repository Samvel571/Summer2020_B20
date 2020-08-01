package practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Replit207 {

    public static void main(String[] args) {


        int[] i = {7, 2, 3, 5};

        int a = i[0];
        i[0] = i[i.length-1];
        i[i.length-1] = a;

        System.out.println(Arrays.toString(i));


        int[] r = new int[5];

        for(int k =0; k < r.length; k++){
            r[k] = k+1;
        }


        System.out.println(Arrays.toString(r));



        String s = "aa2aa3";
        String result = "";

        for (int c = 0; c < s.length(); c++){
           if ( Character.isDigit(s.charAt(c)))
            result+=s.charAt(c);
        }
        System.out.println(result);


        int[] arr = new int[5];

        arr =i;
        arr[arr.length-1] = 5;

        System.out.println(Arrays.toString(arr));
    }
}

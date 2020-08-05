package day38_JavaRecap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collection_Utility {


    public static void main(String[] args) {


        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('R','S','O','D','F', 'A','B', 'C'));

        Collections.sort(chars);

        System.out.println(chars);

        System.out.println("==================================================================");

         ArrayList<Integer> list = new ArrayList<>();
         list.addAll(Arrays.asList(1000,2,4,7,1000,55,64,8,909,34,1000,456,7777,45,-4,-44));

        Integer max = Collections.max(list);

       Integer min = Collections.min(list);

        System.out.println("max= "+max);
        System.out.println("min= "+min);


        Collections.replaceAll(list,1000,100000000);

        System.out.println(list);
    }



}
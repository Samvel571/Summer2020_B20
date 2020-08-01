package practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arrays_getDup {
    public static void main(String[] args) {


        String[] r = {"1", "g", "aabb", "7", "7", "2", "aa", "7","1"};



            ArrayList<String> list = new ArrayList<>(Arrays.asList(r));
            ArrayList<String> result = new ArrayList<>();
            int count = 0;
            for(int i = 0;i<list.size(); i++){
                count = Collections.frequency(list,list.get(i));
                if (count > 1 ) {
                    result.add(list.get(i));
                }
            }

        System.out.println(result.size() );

            //hghgghghghghgh
        }

    }






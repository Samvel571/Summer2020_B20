package Practice_08_25_2020;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {
       String[] arr = {"Eggs", "Orange","Milk", "Milk", "Toilet Paper","Toilet Paper","Toilet Paper","Toilet Paper", "Avocado"};



        ArrayList<String>  item = new ArrayList<>();

        item.addAll(Arrays.asList(arr));
        int count =  Collections.frequency(item,"Toilet Paper");

        System.out.println(count);

        item.removeIf(p -> Collections.frequency(item , p) ==1);

        System.out.println(item);


    }
}

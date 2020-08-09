package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(30,20,56,78,100,20,0,-1,-3,400,500,5000));

        //maximum
        Integer max = Collections.max(list);

         //minimum

        Integer min = Collections.min(list);

        System.out.println(max);
        System.out.println(min);


        System.out.println("==================================================");


       // replaceAll

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ramazan", "Islem", "Muhtar", "Asiya", "Muhtar","Saim"));

        Collections.replaceAll(names,"Muhtar","Sam");

        System.out.println(names);











    }



}

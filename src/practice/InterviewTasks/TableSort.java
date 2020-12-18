package practice.InterviewTasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class TableSort {

    /*
    Let's say there is a table on a web page and you sorted it.
    This table was given to you as a Set of Strings.
    Verify if the the table was sorted appropriately
     */

    public static boolean isSorted(Set<String> set){
        ArrayList<String> list = new ArrayList<>(set);

        for (int i = 0; i < list.size()-1; i ++){

            String first =  list.get(i);
            String second = list.get(i+1);

            if (first.compareTo(second) > 0){
                return false;
            }
        }

      return true;
    }

    public static void main(String[] args) {
        String s = "java";
        String s2 = "apple";

        System.out.println(s.compareTo(s2));


        Set<String> set = new LinkedHashSet<>(Arrays.asList("abc","java","zebra"));

        System.out.println(TableSort.isSorted(set));

    }

}

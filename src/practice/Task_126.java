package practice;
import java.lang.reflect.Array;
import java.util.*;
public class Task_126 {
    public static void main(String[] args) {
       String[] arr = {"post", "assert", "macadamia","transmission","says","windows", "liberty", "five"};

      // int minLength = arr[0].length();

       String result = arr[0];
       String results2 = "";
     for (String each : arr){
         if(each.length() < result.length()){
             result = each;
         }
         if(each.length()== result.length()){
             results2 += each+";";
         }
     }
      String[] array = results2.split(";");

        System.out.println(Arrays.toString(array));
    }
}

//
//
//
//
//
//
/*

    String[] arr = str.split(", ");

    String shortWords ="";
    int shortestLength =arr[0].length();

        for(String each : arr){
            if (each.length() < shortestLength){
                shortestLength = each.length();
               }
        }
               for(String  each : arr){
            if(each.length() == shortestLength){
              shortWords += each+",";
            }
               }

        String[] result = shortWords.split(",");
       Arrays.sort(result);
        System.out.println(Arrays.toString(result));
  }
}
 */
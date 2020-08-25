package practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

//         int[] arr = {1,2,3,4,5,6,7};
//
//         int[] reverse = new int[5];
//


//        int k =0;
//        for (int i = arr.length-1; i >=0;i--){
//            reverse[k] = arr[i];
//
//            k++;
//        }
      //  System.out.println(Arrays.toString(reverse));
//
//       reverse[0] = arr[6];
//       reverse[1] = arr[5];
//       reverse[2] = arr[4];
//       reverse[3] = arr[3];
//       reverse[4] = arr[2];
//       reverse[5] = arr[1];
//       reverse[6] = arr[0];

      //  System.out.println(Arrays.toString(reverse));


        String name = "Alena is learning hard";
        String[] arr = name.split(" ");

        //String[] reverse = new String[arr.length];
        String result = "";

        for (int i =arr.length-1; i >= 0; i-- ){

            result+=arr[i]+" ";
        }

        System.out.println(result);




    }

}

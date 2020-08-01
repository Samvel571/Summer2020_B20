package practice;

import java.util.ArrayList;


/*
refuel_times([7,7,7],7)
returns:3 (3 fuel stops 7 units each delivery)
 */

public class DeliveryCalc {
//                                                     21
    public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel)
    {

    int sum =0;
    int results = 0;
    for (Integer each : deliveries){
        sum+=each;
    }
     results = sum / max_fuel;
    return  results;
    }

    public static void main(String[] args)
    {

        ArrayList<Integer>  arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(6);
        int times = refuel_times(arr,3);
        System.out.print(times);//should output 5


    }//end main
}

package practice;

import java.util.ArrayList;

public class replt {

    public static void main(String[] args) {


        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        timesTwo(nums);
    }

        //create your method below
        public static void timesTwo(ArrayList<Integer> nums) {
            ArrayList<Integer> newNums = new ArrayList<>();


            int k =0;
            for (int i = 0; i<nums.size();i++) {
                newNums.set(k,nums.get(i) * 2);
                k++;
            }

            System.out.println(newNums);
            
            //hjhjhjhjhjhhjhj
        }

}

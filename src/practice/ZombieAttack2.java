package practice;

import java.util.*;

public class ZombieAttack2 {

    public static void main(String[] args) {

        int[] inhabitants = {30, 20, 0, 20, 20, 10, 0, 10};

        int days = 0;

        System.out.println("Day " + days + " " + Arrays.toString(inhabitants));

        List<Integer> zombieCities = new ArrayList<Integer>();
        while (true){
            for (int i = 0; i < inhabitants.length; i++) {// looping through the cities in the world
                if (!zombieCities.contains(i) && inhabitants[i] < 1) {
                    zombieCities.add(i);
                }
            }

            if (zombieCities.size() == inhabitants.length) break;

            for (Integer zCityIndex: zombieCities) {// divide left side
                if (zCityIndex - 1 >= 0 && !zombieCities.contains(zCityIndex-2) ) {
                    inhabitants[zCityIndex - 1] = inhabitants[zCityIndex - 1] / 2;
                }
                if (zCityIndex + 1 <= inhabitants.length - 1) {// divide right side
                    inhabitants[zCityIndex + 1] = inhabitants[zCityIndex + 1] / 2;
                }
            }




            days++;
            System.out.println("Day " + days + " " + Arrays.toString(inhabitants));
        }
        System.out.println("---- EXTINCT ----");
//
//
//        for (int j = 0; j < inhabitants.length; j++) {
//            int sum = 0;
//            System.out.println("Day " + (j) + " " + Arrays.toString(inhabitants));
//            for (int i = 0; i < inhabitants.length; i++) {
//                inhabitants[i] = inhabitants[i] / 2;
//                sum += inhabitants[i];
//            }
//            if (sum == 0) {
//                System.out.println("Day " + (j + 1) + " " + Arrays.toString(inhabitants));
//                System.out.println("---- EXTINCT ----");
//                break;
//            }
//        }
    }
}
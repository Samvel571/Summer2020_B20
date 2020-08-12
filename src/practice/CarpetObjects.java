package practice;


import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {

    public static void main(String[] args) {


        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};
        carpets[0].customOrder(7.5, 8, 17, true);
        carpets[1].customOrder(5.4, 6.3, 18, false);
        carpets[2].customOrder(9.2, 7.1, 19, true);
        carpets[3].customOrder(9, 8, 11, false);
        carpets[4].customOrder(12, 17, 14, true);


        ArrayList<Carpet> persianCarpets = new ArrayList<>(Arrays.asList(carpets));
        persianCarpets.removeIf(p -> !p.isPersian);
        for (int i = 0; i < persianCarpets.size(); i++) {
            System.out.println("Persian carpet " + (i + 1) + ":");
            persianCarpets.get(i).getCarpetInfo();
        }
        System.out.println();

        ArrayList<Carpet> regularCarpets = new ArrayList<>(Arrays.asList(carpets));
        regularCarpets.removeIf(p -> p.isPersian);

        for (int i = 0; i < regularCarpets.size(); i++) {
            System.out.println("Regular carpet " + (i + 1) + ":");
            regularCarpets.get(i).getCarpetInfo();
        }


    }

}

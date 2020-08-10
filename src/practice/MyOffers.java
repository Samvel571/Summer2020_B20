package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {


        Offer offer1 = new Offer();
        offer1.setInfo("Chicago", "SDET", 120000, true, false);

        Offer offer2 = new Offer();
        offer2.setInfo("Chicago", "Developer", 150000, true, true);

        Offer offer3 = new Offer();
        offer3.setInfo("Michigan", "SDET", 90000, false, true);

        Offer offer4 = new Offer();
        offer4.setInfo("Virginia", "Scrum Master", 100000, true, false);

        Offer offer5 = new Offer();
        offer5.setInfo("California", "Developer", 140000, true, true);

        Offer offer6 = new Offer();
        offer6.setInfo("New York", "SDET", 170000, false, false);

        Offer offer7 = new Offer();
        offer7.setInfo("Texas", "QA", 110000, true, false);


        ArrayList<Offer> allOffers = new ArrayList<>();
        allOffers.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));

        //  allOffers.removeIf(p-> !p.location.equals("Chicago"));
        // allOffers.removeIf(p-> !p.jobTitle.equals("SDET") && !p.jobTitle.equals("QA"));
        //  allOffers.removeIf(p-> p.workFrHome == false);
        allOffers.removeIf(p -> p.hasBenefit == false);

        System.out.println(allOffers.size());

        for (Offer each : allOffers) {
            each.getInfo();
        }
    }
}

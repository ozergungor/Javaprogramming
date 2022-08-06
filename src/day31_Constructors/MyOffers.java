package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        Offer offer1 = new Offer();

        offer1.setInfo("VA", "Amazon Inc", "SDET", 11900, true, true, true, true);

        Offer offer2 = new Offer();
        offer2.setInfo("CA", "Sony Inc", "QA", 12495, false, true, false, true);

        Offer offer3 = new Offer();
        offer3.setInfo("Florida", "Apple", "Engineer", 23500, true, false, true, false);

        Offer offer4 = new Offer();
        offer4.setInfo("Boston", "Nike", "Developer", 17400, false, true, false, false);

        Offer offer5 = new Offer();
        offer5.setInfo("Texas", "Adidas", "BA", 14000, true, false, true, false);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);

        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5};
        ArrayList<Offer> fullTimeOffer = new ArrayList<>(Arrays.asList(myOffers));

        fullTimeOffer.removeIf(p-> !p.isFullTime);

        System.out.println("fullTimeOffer = " + fullTimeOffer);
        System.out.println(fullTimeOffer.size());

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));

        localOffers.removeIf(p-> !p.location.equals("VA"));

        System.out.println(localOffers.size());






    }
}

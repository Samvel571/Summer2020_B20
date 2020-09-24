package practice.Interface;

public class PhoneObjects {

    public static void main(String[] args) {

         IPhone iPhone1 = new IPhone("11 Pro",5,6.7);
          System.out.println(iPhone1);// Throws InvalidPriceException with message "Invalid Price, cannot be negative"
           IPhone iPhone2 = new IPhone("X", 1200,5.9);
            System.out.println(iPhone2); // Throws InvalidPriceException with message "Invalid Price, Iphone's price cannot more than 1500"

        IPhone iPhone3 = new IPhone("XS", 999.99, 5.9);
        System.out.println(iPhone3);// prints :   Brand: IPhone, Model: XS, Price: 999.99, Size: 5.9 inches
        iPhone3.downloadAppleApp("Capital One");//prints: Downloading Capital One app from Apple App Store
        iPhone3.calling(202123456);//prints  Calling to 202123456 using my IPhone XS
        iPhone3.texting(202123456);// Texting to 202123456 using my IPhone XS
        iPhone3.faceTiming(202123455); //FaceTiming to 202123455 using my IPhone XS


        // Samsung samsung1 = new Samsung("Galaxy 10",-200, 7.1);
        //  System.out.println(samsung1); // Throws InvalidPriceException with message "Invalid Price, cannot be negative"
        //   Samsung samsung2 = new Samsung("Galaxy 11",1300,6.9);
        //    System.out.println(samsung2); //Throws InvalidPriceException with message "Invalid Price, Samsung' price cannot more than 1200"
        System.out.println();

        Samsung samsung3 = new Samsung("Galaxy 12", 900, 5.9);
        System.out.println(samsung3); // prints:       Brand: Samsung, Model: Galaxy 12, Price: 900.0, Size: 5.9 inches
        samsung3.downloadAndroidApp("Candy Crush");// Downloading Candy Crush app from Android App Store
        samsung3.calling(20212345);// prints:  Texting to 20212345 using my Samsung Galaxy 12
        samsung3.texting(202123456);// prints: Texting to 202123456 using my Samsung Galaxy 12
        samsung3.freezing(); //prints:   My Samsung Galaxy 12 keeps freezing



        Phone iphonePhone2 = new IPhone("11 Pro",1200,5);
        System.out.println(iphonePhone2);
        Phone samsungPhone2 = new Samsung("S8",1000,900);
        System.out.println(samsungPhone2);

        Phone[] phones = {iphonePhone2,samsungPhone2,iPhone3,iPhone2,samsung3};


    }


}

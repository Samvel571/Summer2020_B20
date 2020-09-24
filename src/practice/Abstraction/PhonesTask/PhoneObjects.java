package practice.Abstraction.PhonesTask;

public class PhoneObjects {

    public static void main(String[] args) {


        IPhone iPhone = new IPhone("Apple Iphone","11 Pro", 5.8,1029.99);

        Samsung samsung = new Samsung("Samsung","Galaxy s10",6.1,749.99);

        Nokia nokia = new Nokia("Nokia","C3",5.99,349);

        iPhone.call(202123456);
        iPhone.text(703123456);
        iPhone.faceTime(301123456);
        iPhone.selfie();

        System.out.println("=====================================");

        samsung.call(240123456);
        samsung.text(571234567);
        samsung.selfie();
        samsung.freezing();

        System.out.println("======================================");

        nokia.call(443123456);
        nokia.text(657898765);
        nokia.looseValue();

    }

}

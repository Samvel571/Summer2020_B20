package day39_CustomClass;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setDogInfo("Max","German Shepherd","medium",3,"grey");

        Dog dog2 = new Dog();
        dog2.setDogInfo("Siwan","Beagle","medium",2,"Mix");

        Dog dog3 = new Dog();
        dog3.setDogInfo("Lory","Maltese","small", 2, "white");




        dog1.getDogInfo();
        dog2.getDogInfo();
        dog3.getDogInfo();


        dog1.eating("Kelle Paca");
        dog3.eating("Steak");
        dog2.eating("polo");


        dog3.drink("cola");
        dog1.drink("milk");
        dog2.drink("redbull");

       dog1.sleep();
       dog2.sleep();
       dog3.sleep();



    }
}

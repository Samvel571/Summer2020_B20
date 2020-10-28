package practice.FinalPhoneTask;

import practice.Interface.AppleAppStore;

public final class Iphone extends Phone implements AppleAppStore, Downloadable {

    public Iphone( String model, String screenSize, double price) {
        super("Apple", model, screenSize, price);
    }


    @Override
    public void call(long number) {
        System.out.println("My "+brand +" "+model +" is calling to " + number);
    }

    @Override
    public void text(long number) {
        System.out.println("My "+brand +" "+model +" is texting to " + number);

    }

    public void facetime(long number){
        System.out.println("My "+brand +" "+model +" is facetiming to " + number);

    }

    @Override
    public boolean equal(Device device) {
    if (device.brand.equals("Apple") && device.model.equals(this.model)){
        return true;
    }
    return false;
    }

    @Override
    public void downloadAppleApp(String app) {
        System.out.println("Downloading "+app+" using my "+brand+" "+model);

    }

   @Override
    public void download() {


    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", screenSize='" + screenSize + '\'' +
                ", price=" + price +
                '}';
    }
}

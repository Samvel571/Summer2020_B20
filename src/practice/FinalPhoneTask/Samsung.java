package practice.FinalPhoneTask;

import practice.Interface.AndroidAppStore;

public class Samsung extends Phone implements AndroidAppStore {

    public Samsung(String model,String screenSize, double price) {
        super( "Samsung", model, screenSize, price);
    }

    @Override
    public void call(long number) {
        System.out.println("My "+brand +" "+model +" is calling to " + number);

    }

    @Override
    public void text(long number) {
        System.out.println("My "+brand +" "+model +" is texting to " + number);

    }

    @Override
    public boolean equal(Device device) {
        if (device.model.equals("Samsung") && device.model.equals(this.model)){
            return true;
        }
        return false;
    }

    @Override
    public void downloadAndroidApp(String appName) {
        System.out.println("Downloading "+appName+" using my "+brand+" "+model);

    }
}

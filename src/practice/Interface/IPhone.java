package practice.Interface;

public class IPhone extends Phone implements AppleAppStore,Downloadable {

    public IPhone(String model, double price, double size) {
        super("IPhone", model, price, size);
        if (price > 1500) {
            throw new InvalidPriceException("Invalid Price, Iphone's price cannot more than 1500");
        }
    }

    @Override
    public void downloadAppleApp(String appName) {
        System.out.println("Downloading " + appName + " app from " + appStoreName);
    }

    @Override
    public void texting(long number) {
        System.out.println("Texting to " + number + " using my " + brand + " " + model);
    }

    @Override
    public void calling(long number) {
        System.out.println("Calling to " + number + " using my " + brand + " " + model);
    }

    public void faceTiming(long number) {
        System.out.println("FaceTiming to " + number + " using my " + brand + " " + model);
    }

    @Override
    public void download() {

    }
}




package practice.Interface;

public class Samsung extends Phone implements AndroidAppStore {

    public Samsung(String model, double price, double size) {
        super("Samsung", model, price, size);
        if (price > 1200) {
            throw new InvalidPriceException("Invalid Price, Samsung' price cannot more than 1200");
        }
    }

    @Override
    public void downloadAndroidApp(String appName) {
        System.out.println("Downloading " + appName + " app from " + appStoreName);

    }

    @Override
    public void texting(long number) {
        System.out.println("Texting to " + number + " using my " + brand + " " + model);

    }

    @Override
    public void calling(long number) {
        System.out.println("Texting to " + number + " using my " + brand + " " + model);

    }

    public void freezing() {
        System.out.println("My " + brand + " " + model + " keeps freezing");
    }
}

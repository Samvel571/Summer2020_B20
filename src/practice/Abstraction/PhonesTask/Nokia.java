package practice.Abstraction.PhonesTask;

public final class Nokia extends Phones {


    public Nokia(String brand, String model, double size, double price) {
        super(brand, model, size, price);

    }


    @Override
    public void call(long number) {
        System.out.println(brand + " " + model + " is calling to " + number);
    }

    @Override
    public void text(long number) {
        System.out.println(brand + " " + model + " is texting to " + number);

    }

    public void looseValue() {
        System.out.println(brand + " phones are loosing their values every day");
    }
}

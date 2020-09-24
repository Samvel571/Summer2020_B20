package practice.Abstraction.PhonesTask;

public final class Samsung extends Phones {


    public Samsung(String brand, String model, double size, double price) {
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

    public void selfie() {
        System.out.println("Taking average selfies using " + brand + " " + model);
    }

    public void freezing() {
        System.out.println(brand + " " + model + " is freezing very often");
    }

}


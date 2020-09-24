package practice.Abstraction.PhonesTask;

public final class IPhone extends Phones {


    public IPhone(String brand, String model, double size, double price) {
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

    public void faceTime(long number) {
        System.out.println(brand + " " + model + " is Facetiming to " + number);
    }

    public void selfie() {
        System.out.println("Taking great selfies using " + brand + " " + model);
    }


}

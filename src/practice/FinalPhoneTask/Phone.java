package practice.FinalPhoneTask;

public abstract class Phone extends Device{


    public Phone( String brand, String model,String screenSize, double price) {
        super(brand, model, screenSize, price);


    }


    public abstract void call(long number);


    public abstract void text(long number);

    @Override
    public abstract boolean equal(Device device);

}

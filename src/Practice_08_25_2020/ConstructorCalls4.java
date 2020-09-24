package Practice_08_25_2020;

public class ConstructorCalls4 {
double a;
    public ConstructorCalls4(){
        // this();
        // this(3.5);
    }
    public ConstructorCalls4(String a){
        this(2.5);

        System.out.println("Y");
    }
    public ConstructorCalls4(double a){
        // this(10);
        this();   //contains default constructor
         this.a=a;
        System.out.println("X");
    }

    @Override
    public String toString() {
        return ""+a;
    }

    public static void main(String[] args) {
       ConstructorCalls4 obj = new ConstructorCalls4('a');
        System.out.println(obj);
    }

}

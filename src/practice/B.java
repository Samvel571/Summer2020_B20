package practice;


import java.util.ArrayList;

public class B {

    static int number;


    public B(String str) {


    }

    public B(int num){
    }

    public B(){

        number+=1;
    }


}

    class Test {

        public static void main(String[] args) {

            new B();
            B a = new B();
            B a2 = new B("word");

        }


    }

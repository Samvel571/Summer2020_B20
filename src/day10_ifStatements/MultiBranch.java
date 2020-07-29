package day10_ifStatements;

public class MultiBranch {

    public static void main(String[] args) {
        int number = 100;

        if(number > 0){
            System.out.println(number +" is positive");
        }

        if(number < 0){
            System.out.println(number+ " is negative");
        }

        if(number == 0){
            System.out.println(number + " is zero");
        }

        System.out.println("======================================");

        if(number > 0){
            System.out.println(number+" is positive");
        }else if(number < 0){
            System.out.println(number+" is negative");
        } else  { // number ==0
            System.out.println(number +" is zero");
        }


        int num = 10;
        if(--num >10){
            System.out.println("hello"+num);
        }else if(num ==9 ){
            System.out.println("word"+num);
        }
        System.out.println(num);


    }

}

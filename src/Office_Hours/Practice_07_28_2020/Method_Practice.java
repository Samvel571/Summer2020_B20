package Office_Hours.Practice_07_28_2020;

import java.util.ArrayList;

public class Method_Practice {


    public static String reverseString(String str){

        String results ="";

        for(int i = str.length()-1; i>=0; i--){

            results += str.charAt(i);
        }


        return results;
    }


    public  static void isPalindrome(String str){//ABC

        String reverseStr = reverseString(str);//CBA

        boolean palindrome = str.equalsIgnoreCase(reverseStr);

        System.out.println(  palindrome ?  str+ " Is Palindrome" :  "Is not Palindrome" );



    }





    public static void main(String[] args) {
        System.out.println( reverseString("Samvel") );
        isPalindrome("menak Katak Kanem");

        System.out.println("=========================================================");

        String[] names = {"Aslan", "Ramazan", "Bob", "Efran", "Ayhan"};

        ArrayList<String> list = new ArrayList<>();

        for (String each : names){
           // System.out.println(reverseString(each));
            //isPalindrome(each);
            list.add(reverseString(each));

        }
        System.out.println(list);
    }

}

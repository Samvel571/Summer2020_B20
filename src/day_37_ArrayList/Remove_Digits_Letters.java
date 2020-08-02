package day_37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Digits_Letters {
    public static void main(String[] args) {

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A','b','c','3','4','%','$','#','h','6','*'));


//          chars.removeIf(p->Character.isDigit(p));
//          chars.removeIf(p->Character.isLetter(p));
//
          chars.removeIf(p->Character.isLetterOrDigit(p));
//
//        chars.removeIf(p-> p>64 && p < 91);
//        chars.removeIf(p-> p > 96 && p < 123);

        System.out.println(chars);

        System.out.println("===========================================================");


        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('A','b','c','3','4','%','$','#','h','6','*'));

        ArrayList<Character> digits = new ArrayList<>(list);


        digits.removeIf(p->!Character.isDigit(p));
        System.out.println(digits);

        ArrayList<Character> letters = new ArrayList<>(list);

        letters.removeIf(p-> !Character.isLetter(p));
        System.out.println(letters);

        ArrayList<Character> specialChars = new ArrayList<>(list);

        specialChars.removeAll(letters);
        specialChars.removeAll(digits);

      //  specialChars.removeIf(p->Character.isDigit(p) || Character.isLetter(p));
        System.out.println(specialChars);


    }
}

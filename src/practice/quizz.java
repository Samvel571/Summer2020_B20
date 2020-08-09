package practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class quizz {

    public static void main(String[] args) {


        ArrayList<Character> list = new
                ArrayList<>();
for(char i ='a';i<='z'; i++){
    list.add(i);

    boolean results = list.containsAll(Arrays.asList('a','c','D'));

    System.out.println(results);
}

        System.out.println();
    }
}

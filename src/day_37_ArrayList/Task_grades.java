package day_37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_grades {
    public static void main(String[] args) {

        ArrayList<Integer> grades = new ArrayList<>();
        grades.addAll(Arrays.asList(100,90,75,85,65,86,85,55,45,73,73,35,47));

        ArrayList<Integer> gradOfA = new ArrayList<>();// 90~100
        gradOfA.addAll(grades);
        gradOfA.removeIf(p->p < 90);


        ArrayList<Integer> gradOfB = new ArrayList<>();// 80~ 89
        gradOfB.addAll(grades);
        gradOfB.removeIf(p->p < 80 || p > 89);


        ArrayList<Integer> gradOfC = new ArrayList<>();// 70~ 79
        gradOfC.addAll(grades);
        gradOfC.removeIf(p-> p < 70 || p >79);


        ArrayList<Integer> gradOfD = new ArrayList<>();// 60 ~69
        gradOfD.addAll(grades);
        gradOfD.removeIf(p-> p< 60 || p > 69);



        ArrayList<Integer> gradOfF = new ArrayList<>();// bellow 60
        gradOfF.addAll(grades);
        gradOfF.removeIf(p-> p >59);


        System.out.println("grade A = " + gradOfA.size());
        System.out.println("grade B = " + gradOfB.size());
        System.out.println("grade C = " + gradOfC.size());
        System.out.println("grade D = " + gradOfD.size());
        System.out.println("grade F = " + gradOfF.size());



        /*
        how many students made:
        A?
        B?
        C?
        D?
         */




    }
}

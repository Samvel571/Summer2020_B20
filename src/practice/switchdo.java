package practice;

import java.util.Arrays;

public class switchdo {

    // do_switch([7,2,3,5])
    // returns:[5,2,3,7]
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 2;
            System.out.println(Arrays.toString(do_switch((a))));
        }
    }

    public static int[] do_switch(int[] i) {
        int temp = i[0];
        i[0] = i[i.length - 1];
        i[i.length - 1] = temp;
        return i;
    }
}
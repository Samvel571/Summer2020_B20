package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int size =scan.nextInt();

        int[] a = new int[size];
        int i = 0;

        while (i<size){
            a[i++] = scan.nextInt();

        }

        method8(a);

    }


    public static void method8(int[] arr){

        for (int n : arr) {
            if (n % 4 == 0) {
                continue;
            }

            System.out.println(n);
        }
    }

}
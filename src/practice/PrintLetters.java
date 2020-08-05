package practice;

import java.util.Scanner;

public class PrintLetters {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    char start = scan.next().charAt(0);
    char end = scan.next().charAt(0);

   String results = "";
    for(int i = start; i <= end; i++){
      System.out.print((char) i+" ");

    }
   // System.out.println(results);
  }
}
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class HTML {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String html = "<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";

        String id = "";
        if (html.contains("id=")) {
            String[] arr = html.split(" ");
            for (String each : arr) {
                if ((each.contains("id="))) {
                    id = each;
                }

            }
            String[] arr1 = id.split("\"");

            System.out.println(arr1[1]);
        } else {
            System.out.println("Invalid results");
        }

        String str = "xxbreadapple";
        //scan.next();

        String temp = "";
        int breadIndex = 0;
        if (str.contains("bread")) {
            breadIndex = str.indexOf("bread");
            temp = str.replaceFirst("bread", "");
        }

        if (temp.contains("bread")) {

            String results = str.substring(breadIndex + 5, str.lastIndexOf("bread"));

            System.out.println(results);
        }else{
            System.out.println("nothing");
        }

    }
}






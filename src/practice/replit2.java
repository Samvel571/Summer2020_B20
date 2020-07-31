package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class replit2 {




        //create your method below

        public static ArrayList<String> combineAl(ArrayList<String> wordList1, ArrayList<String> wordList2){

            ArrayList<String> list = new ArrayList<>();
            list.addAll(wordList1);
            list.addAll(wordList2);

            return list;
        }


    public static void main(String[] args) {

        String[] arr = {"A", "b", "C"};

        String[] arr1 = {"L", "M", "N"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));
        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList(arr1));

        System.out.println("combineAl(arrayList,arrayList1) = " + combineAl(arrayList, arrayList1));

    }

    }



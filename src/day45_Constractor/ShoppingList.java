package day45_Constractor;

import com.sun.tools.javac.jvm.Items;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList extends Item{



    static String name = "Mike";
    String id = "123";

    static {
        name = "Jordan";
    }

    public ShoppingList(String Name, double unitPrice, int quantity) {
        super(Name, unitPrice, quantity);

    }


    public static void main(String[] args) {
        name = "Jean";
        System.out.println(name);


        Item item1 = new Item("name",3.1,2);
        System.out.println(item1.unitPrice+item1.name);


//        Item item2 = new Item("Apple",4.2,5);
//        Item item3 = new Item("Potatoes",3.6,4);
//        Item item4 = new Item("Tomatoes",5.8,7);
//        Item item5 = new Item("Onions",1,2);

        //  ArrayList<Item> Items = new ArrayList<>(Arrays.asList(item1,item2,item3,item4,item5));

//
//           for (Item each : Items){
//               double total = each.calcCost();
//           }
//        System.out.println(item1);
//    }
    }
}
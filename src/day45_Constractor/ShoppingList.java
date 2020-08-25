package day45_Constractor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    public static void main(String[] args) {

        Item item1 = new Item("Orange",2.5,3);
        Item item2 = new Item("Apple",4.2,5);
        Item item3 = new Item("Potatoes",3.6,4);
        Item item4 = new Item("Tomatoes",5.8,2);
        Item item5 = new Item("Onions",1,2);

        ArrayList<Item> Items = new ArrayList<>(Arrays.asList(item1,item2,item3,item4,item5));



    }
}

package org.sda.generics.homework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *Create a simple Generic class, that will give a possibility to store any kind of value within.
 * Add object of type String, Integer, Double to array of that Generic type
 * Print all the values of the array within a loop
 *
 * @author Kätlin Padesaar-Korela
 */

public class GenericType<T> {


    @Override
    public String toString() {
        return "GenericType{" +
                "items=" + items +
                '}';
    }

    private T items;

    public static <T> void main(String[] args) {


        List<String> itemsList = new ArrayList<>();
        itemsList.add("fruit");
        List<Integer> itemsList2 = new ArrayList<>();
        itemsList2.add(8);
        List<Double> itemsList3 = new ArrayList<>();
        itemsList3.add(9.5d);

        List<T> allItems = (List<T>) List.of(itemsList, itemsList2, itemsList3);
        System.out.println(allItems);

        for(T itemList: allItems){
            System.out.println(itemList); //it will loop and print all the values of the list
        }
    }



}

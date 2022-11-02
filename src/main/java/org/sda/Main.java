package org.sda;

import org.sda.generics.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //GENERIC TYPES
        // it a generic type class of interface that is parametrized over types
        //common types

        Fruit fruit = new Fruit();
        fruit.setName("Apple");
        fruit.setColor("Green");
        fruit.setPrice(BigDecimal.valueOf(1.99)); //converting a double to big decimal

        GenericFood<Fruit> genericFoodWithFruit = new GenericFood<>(fruit);
        System.out.println(genericFoodWithFruit.getItem());

        String str = "I'm a great developer";
        GenericFood<String> genericFoodWithString = new GenericFood<>(str);
        System.out.println(genericFoodWithString.getItem());

        genericFoodWithString.setItem("I'm a good person");
        System.out.println(genericFoodWithString.getItem());

        //Generic type extends class
        Vegetable vegetable = new Vegetable();
        GenericExtendFood<Vegetable> vegetableGenericExtendFood = new GenericExtendFood<>(vegetable);
        System.out.println(vegetableGenericExtendFood.getRating());


        //Generic type interface
        Snack snack1 = new Snack(5);
        Snack snack2 = new Snack(3);
        System.out.println("Snack 1 is better than snack 2:" + snack1.isBetter(snack2));

        //E, T - element type
        //• K - key type
        //• V - value type
        //• T - type
        //• N - number type
        //• S, U, V if there are more parametrized types


        //COLLECTIONS - group of same type
        //list or array of same type
        //List - ordered list of elements, duplicates
        //Set - set of elements, no duplicate
        //Map - it's a dictionary, storage keys and values

        //Key of 0 refers to Skoda, 1 refers to BMw and so on
        // 0 is key, skoda is value
        //list is generic type, starts with index of 0
        //list extends the collection interface

        //List

        List<String> animalList = new ArrayList<>();
        //add item to lisyt
        animalList.add("Lion"); //index 0
        animalList.add("Tiger"); //1
        animalList.add("Rabbit"); //2
        animalList.add("Cat");
        animalList.add("Bear");
        animalList.add("Monkey");
        animalList.add("Panda");

        System.out.println(animalList.get(1)); //print tiger
        animalList.remove(1); //tiger will be deleted
        animalList.remove("Rabbit");
        //animalList.removeAll();
        //loop the list
        for(String animal: animalList){
            System.out.println(animal); //it will loop and print all the values of the list
        }

        //iterator is similar to scanner.next
        //it's so that we can loop items on the list
        Iterator<String> stringIterator = animalList.listIterator();
        while(stringIterator.hasNext()) {
            System.out.println(stringIterator.next() + " ,"); //gives the value of next item on the list
        }

        //remove all
        List<String> removeAnimalList = new ArrayList<>();
        removeAnimalList.add("Cat");
        removeAnimalList.add("Panda");

        animalList.removeAll(removeAnimalList);
        for(String animal: animalList){
            System.out.println(animal); //it will loop and print all the values of the list
        }

        //exercise



    }
}
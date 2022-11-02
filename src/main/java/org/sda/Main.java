package org.sda;

import org.sda.generics.*;

import java.math.BigDecimal;

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




    }
}
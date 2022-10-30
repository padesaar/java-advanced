package org.sda.homework;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setName("Moose");
        Cat cat1 = new Cat();
        cat1.setName("Dobby");

        Animal[] animals = Animal.yieldVoice();


        for(Animal animal: animals){
            System.out.println(Arrays.toString(animals));
            break;
        }

        System.out.println(dog1.getName());
        System.out.println(cat1.getName());
}

}

package org.sda.homework;

/**
 * Create classes Dog and Cat.
 * a) Move common methods and fields to the class Animal.
 * b) Create method „yieldVoice”.
 * c) Create simple array of type Animal, that will contain one object of type Dog and one object of type Cat.
 * d) Using for-each loop show which animal gives what kind of voice. How to print a name of an object?
 * @author Kätlin Padesaar-Korela
 */

public class Cat extends Animal {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String favouriteFood;
    private String name;


    public Cat(String voice, String breed) {
        super(voice, breed);
    }

    public Cat() {

    }

    @Override
    public String toString() {
        return "Cat{" +
                "voice='" + voice + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

}

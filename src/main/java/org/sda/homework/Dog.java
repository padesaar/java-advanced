package org.sda.homework;

/**
 *
 * Create classes Dog and Cat.
 * a) Move common methods and fields to the class Animal.
 * b) Create method „yieldVoice”.
 * c) Create simple array of type Animal, that will contain one object of type Dog and one object of type Cat.
 * d) Using for-each loop show which animal gives what kind of voice. How to print a name of an object?
 * @author Kätlin Padesaar-Korela
 */

public class Dog extends Animal {
    private boolean barks;

    public boolean isBarks() {
        return barks;
    }

    public void setBarks(boolean barks) {
        this.barks = barks;
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }

    public void setFavouriteToy(String favouriteToy) {
        this.favouriteToy = favouriteToy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String favouriteToy;
    private String name;

    public Dog(String voice, String breed) {
        super(voice, breed);
    }

    public Dog() {
        super();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "voice='" + voice + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}

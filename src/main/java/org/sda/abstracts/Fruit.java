package org.sda.abstracts;

/**
 * Fruit class matching the abstract class
 *
 * @author Kätlin Padesaar-Korela
 */

public class Fruit extends Food {
    public Fruit(String color) {
        super(color);
    }

    @Override
    public void eat() {
        System.out.println("I'm eating a fruit.");
    }


}

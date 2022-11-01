package org.sda.abstracts;

/**
 * An abstract food class
 *
 * @author Kätlin Padesaar-Korela
 */

public abstract class Food {
    private String color;

    public Food(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //abstract matters:
    // you can only define it here, but cannot write the implementation here
    //implementation will be in extending classes
    public abstract void eat();

    //public and protected works here
    //protected - it can extend child class
}

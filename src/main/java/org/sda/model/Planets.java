package org.sda.model;

/**
 * Enum exercise
 * Override toString method, it should print relative size of a planet and it's name
 *Create distanceFromEarth method
 * Verify both methods for multiple planets
 * e.g. "Huge Jupiter", "Small Pluto"
 * @author Kätlin Padesaar-Korela
 */

public enum Planets {

    EARTH(20000, "My Earth"),
    JUPITER(34000, "Huge Jupiter"),
    MARS(250000, "Adjacent Mars"),
    SATURN(430000, "Ring Saturn"),
    PLUTO(3440000, "Small Pluto"),
    VENUS(600000, "Evening Star Venus");

    private float relativeSize;
    private String name;


    Planets(float relativeSize, String name) {
        this.relativeSize = relativeSize;
        this.name = name;
    }

    public void setRelativeSize(float relativeSize) {
        this.relativeSize = relativeSize;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Planets{" +
                "relativeSize=" + relativeSize +
                ", name='" + name + '\'' +
                '}';
    }

    public double distanceFromEarth() {

        return EARTH.relativeSize - this.relativeSize;
    }
}

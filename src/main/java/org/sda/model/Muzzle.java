package org.sda.model;

/**
 * Create a Muzzle class
 * Create a Muzzle object
 * Assign the created object to Dog object
 * How to use a Dog object to show all attributes of a Muzzle object
 *
 * @author Kätlin Padesaar-Korela
 */

public class Muzzle {
    private long id;
    private int noiseRange;
    private boolean isTooNoisy;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNoiseRange() {
        return noiseRange;
    }

    public void setNoiseRange(int noiseRange) {
        this.noiseRange = noiseRange;
    }

    public boolean isTooNoisy() {
        return isTooNoisy;
    }

    public void setTooNoisy(boolean tooNoisy) {
        isTooNoisy = tooNoisy;
    }

    @Override
    public String toString() {
        return "Muzzle{" +
                "id=" + id +
                ", noiseRange=" + noiseRange +
                ", isTooNoisy=" + isTooNoisy +
                '}';
    }
}

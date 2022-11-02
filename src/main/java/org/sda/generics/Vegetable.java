package org.sda.generics;

import org.sda.generics.Food;

/**
 * A child class of Food
 * @author Kätlin Padesaar-Korela
 */

public class Vegetable extends Food {
    @Override
    public float rating() {
        return 4.35f;
    }
}

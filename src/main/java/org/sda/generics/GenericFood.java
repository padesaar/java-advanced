package org.sda.generics;

/**
 * Generic food class
 *
 * @author Kätlin Padesaar-Korela
 */

public class GenericFood<T> {
    private T item; //T can be anything: string, double, fruit, int
    // this is now private Fruit item (after we did first thin in main)
    public GenericFood(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

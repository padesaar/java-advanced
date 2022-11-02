package org.sda.generics;

/**
 * Generic comparable interface
 * @author Kätlin Padesaar-Korela
 */

public interface Comparable<T> {

    /**
     * Compare two object fields and return to better object
     * @param item Generic
     * @return true or false
     */
    boolean isBetter(T item);

}

package org.sda.generics.homework;

/**
 * Compare two object fields and return to taller object
 *
 * @param <T> Generic
 * @return true or false
 */

public interface Comparable2<T> {

        boolean isTaller(T item);

        boolean compareTo(T item);
}

package org.sda.concurrency.synchronization;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Synchronization base class
 *
 * @author Kätlin Padesaar-Korela
 */
@AllArgsConstructor
@Getter
public class ShoppingCart {
    private int numberOfProducts;

    public void addProduct(int quantity) { //public synchronized void
        System.out.println("Adding product");
        synchronized (this) { //only this line is synchronized
        numberOfProducts += quantity;
    }
    }
    public void removeProduct(int quantity){
        System.out.println("Removing product");
        numberOfProducts -= quantity;
    }

}

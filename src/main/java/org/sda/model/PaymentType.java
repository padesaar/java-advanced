package org.sda.model;

/**
 * List of Payment Types
 * @author Kätlin Padesaar-Korela
 */

public enum PaymentType {

    //enums are predefined values
    // enums should be in capital letters

    CARD(1),
    CASH (2),
    BANK_TRANSFER (3),
    MOBILE_BANKING (4),
    BANK_LINK (5);

    private int value;

    PaymentType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

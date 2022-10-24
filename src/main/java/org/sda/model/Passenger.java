package org.sda.model;

/**
 *
 *
 * @author Kätlin Padesaar-Korela
 */

public class Passenger extends Person {
    private String paymentType;
    private String destinationAddress;

    public Passenger(String paymentType, String destinationAddress) {
        this.paymentType = paymentType;
        this.destinationAddress = destinationAddress;
    }

    public Passenger(Long id, String address, String paymentType, String destinationAddress) {
        super(id, address); //super mean you refer to parent class
        this.paymentType = paymentType;
        this.destinationAddress = destinationAddress;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }



}

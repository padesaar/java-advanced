package org.sda.model;

/**
 *
 *
 * @author Kätlin Padesaar-Korela
 */

public class Passenger extends Person {
    private String paymentType;
    private String destinationAddress;

    public Passenger() {

    }

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

    @Override
    public String getEmail(){
        return "sda@gmail.com";


    }

    public String getAddresses(){
        return "Source address:" + super.getAddress() + ", Destination address:" + getDestinationAddress();
    } //super - you can access parent class

    @Override
    public String toString() {
        return "Passenger{" +
                "paymentType='" + paymentType + '\'' +
                ", destinationAddress='" + destinationAddress + '\'' +
                '}';
    }

    public boolean getHiddenAlive() {
        return super.isAlive(); //if you still want to access protected infot
    }
}

package org.sda;

import org.sda.model.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //ENCAPSULATION
        //non arg constructor

        Person person = new Person();
        System.out.println(person.toString());
        System.out.println(person.getId());


        //all argument constructor call
        Person person1 = new Person(123455L, "Kätlin", "Padesaar-Korela", "abc@gmail.com", "+372377849", "Tartu tee, Tallinn" );
        System.out.println(person1.toString());
        System.out.println(person1.getEmail());

        Person person2 = new Person();
        person2.setFirstname("Tony");
        person2.setLastname("Stark");
        System.out.println(person2.getFirstname());
        System.out.println(person2.getLastname());

        Dog dog = new Dog(true, "GERMAN SHEPPERD");
        System.out.println(dog.toString());
        System.out.println(dog.getAge());
        System.out.println(dog.getWeight());

        //INHERITENCE
        Passenger passenger = new Passenger(PaymentType.CARD, "Pärnu");
        passenger.setEmail("passenger@gmail.com"); //access from Person class - mother class


        PrivatePassenger privatePassenger = new PrivatePassenger(PaymentType.CARD, "Tallinn", true, "12314541321");
        privatePassenger.setPersonalIDCode("232648264728"); //access PrivatePassenger's fields
        privatePassenger.setDestinationAddress("Tartu");//access Passenger's field
        privatePassenger.setPhoneNumber("+3729383822"); //access Person's fields

        //overriding -
        Person personOverride = new Person();
        personOverride.setEmail("kpadesaar@gmail.com");

        System.out.println(personOverride.getEmail());

        Passenger passengerOverride = new Passenger();
        passengerOverride.setEmail("kpadesaar@gmail.com");
        System.out.println(passengerOverride.getEmail());

        //polymorphism you can create child object from the parent
        Person person3 = new Person(12345L, "Pärnu");
        Person person4 = new Passenger(PaymentType.CARD, "Viljandi");
        System.out.println(person3.toString());
        System.out.println(person4.toString());

        //protected method
        //passenger. cant find isAlive - it's protected
        //person3. cant find setIsAlive - it's protected

        //calling parent methods
        Passenger passenger1 = new Passenger();
        passenger1.setAddress("Tallinn"); // Person.address
        passenger1.setDestinationAddress("Tartu"); //passenger.destinationAddress
        System.out.println(passenger1.getAddresses());

        //calling parent's hidden field
        passenger1.getHiddenAlive();

        //passing parameters
        Passenger passenger2 = new Passenger(12345L, "Tallinn", PaymentType.CARD, "Tartu");

        printPersonAddress(passenger2);
        printPersonAddressWithPrefix("Person", passenger2);


        //create composition - exercise
        Muzzle muzzle = new Muzzle();
        // How to use a Dog object to show all attributes of Muzzle
        muzzle.setId(8905L);
        muzzle.setNoiseRange(10);
        muzzle.setTooNoisy(true);

        Dog dog1 = new Dog(true, "Dober");
        dog1.setMuzzle(muzzle);

        System.out.println(dog1.getMuzzle().toString());

        //enums are predefined values
        System.out.println(PaymentType.CARD);
        System.out.println(Arrays.toString(PaymentType.values())); //prints all enum values

        System.out.println(PaymentType.BANK_LINK.getValue()); //prints the value of enum number 5

        //looping enums
        for(PaymentType paymentType: PaymentType.values()){
            System.out.println(paymentType.name());
        }
        System.out.println(PaymentType.MOBILE_BANKING.toString());

        // Enum exercise Planets
        System.out.println(">>>>>>>>>>>PLANETS<<<<<<<<<<");
        System.out.println(Planets.JUPITER.toString());
        System.out.println("Distance of " + Planets.JUPITER.name() + " from Earth" + Planets.JUPITER.distanceFromEarth());
        System.out.println("-----------");
        System.out.println(Planets.MARS.toString());
        System.out.println("Distance of " + Planets.MARS.name() + " from Earth" + Planets.MARS.distanceFromEarth());



    }



    private static void printPersonAddress(Person person) { //did this to pass the address info from passenger to passenger through person getAddress
        System.out.println(person.getAddress());
    }

    private static void printPersonAddressWithPrefix(String prefix, Object object) {
        System.out.println(prefix + object);
    }
}
package org.sda;

import org.sda.model.Dog;
import org.sda.model.Passenger;
import org.sda.model.Person;
import org.sda.model.PrivatePassenger;

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
        Passenger passenger = new Passenger("CARD", "Pärnu");
        passenger.setEmail("passenger@gmail.com"); //access from Person class - mother class


        PrivatePassenger privatePassenger = new PrivatePassenger("CARD", "Tallinn", true, "12314541321");
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
        Person person4 = new Passenger("CARD", "Viljandi");
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
        Passenger passenger2 = new Passenger(12345L, "Tallinn", "CASH", "Tartu");

        printPersonAddress(passenger2);
        printPersonAddressWithPrefix("Person", passenger2);

    }

    private static void printPersonAddress(Person person) { //did this to pass the address info from passenger to passenger through person getAddress
        System.out.println(person.getAddress());
    }

    private static void printPersonAddressWithPrefix(String prefix, Object object) {
        System.out.println(prefix + object);
    }
}
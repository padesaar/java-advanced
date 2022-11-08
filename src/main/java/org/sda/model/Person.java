package org.sda.model;

import lombok.*;

/**
 * Person model
 *
 * @author Kätlin Padesaar-Korela
 */
@AllArgsConstructor
@Getter
@ToString
public class Person { //outer-class (nested classes)
    private String firstName;
    private String lastName;
    private String username;
    private int age;

    public boolean isAdult() {
        return age >= 18;
    }


    //non-static (nested classes): without keyword "static"
    @Getter
    @Setter
    @ToString
    public class Employee { //inner class
        private String address;

        public void username() {

            username = firstName.concat(lastName).toLowerCase().replace(" ", "");
            //changing the value of the outer class
        }

    }

    //static nested class, not bound to outer class
    @Getter
    public static class Customer {
        public void username(Person person) { //we cant get outer class valuse, so we have to put in bracec parameter
            person.username = person.firstName.concat(person.lastName).toUpperCase().replace(" ", "");


        }
    }

}

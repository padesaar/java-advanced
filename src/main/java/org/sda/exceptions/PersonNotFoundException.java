package org.sda.exceptions;

/**
 * Exception to handle if the Person is not found
 *
 * @author Kätlin Padesaar-Korela
 */

public class PersonNotFoundException extends Exception{
    // if we create our own exception we must extend it to Exception class

    public PersonNotFoundException(String name) {
        super(String.format("The person (%s) is not found!", name));
    }

}

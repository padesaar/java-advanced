package org.sda.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Person model
 * @author Kätlin Padesaar-Korela
 */
@AllArgsConstructor
@Getter
@ToString
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public boolean isAdult() {
        return age >= 18;
    }


}

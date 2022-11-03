package org.sda.generics;

import lombok.*;

import java.math.BigDecimal;

/**
 * Fruit class of generics
 * @author Kätlin Padesaar-Korela
 */

@Data //all getter and setter wil be generated for this class
@AllArgsConstructor //but they are hidden, it's called boiler-plate coding
@NoArgsConstructor //work of lombok
@ToString
public class Fruit {
    private String name;
    private String color;
    private BigDecimal price; //same as float and double, but it has more precision on decimal points


}

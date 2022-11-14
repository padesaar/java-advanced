package org.sda.streamHomework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Using streams, for given list:
 * ["John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn"]
 * [1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50]
 * a) sort the list
 * b) print only those names that start with letter "E"
 * c) print values greater than 30 and lower than 200
 * d) print names uppercase
 * e) remove first and last letter, sort and print named
 * f) sort backwards by implementing reverse Comparator and using lambda expression
 */

public class StreamsHomework {
    public static void main(String[] args) {

        List<String> namesList = List.of("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");
        List<Integer> numberList = List.of(1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50);

        // a) sort the list
        namesList.stream()
                .sorted()
                .forEach(System.out::println);

        numberList.stream()
                .sorted()
                .forEach(System.out::println);

        // b) print only those names that start with letter "E"
        String nameStartsWithE = namesList.stream()
                .filter(s -> s.startsWith("E"))
                .collect(Collectors.toList()).toString();
        System.out.println(nameStartsWithE);

        // c) print values greater than 30 and lower than 200
        List<Integer> smallNumberList = numberList.stream()
                .filter(s -> s > 30 && s < 200)
                .collect(Collectors.toList());
        System.out.println(smallNumberList);

        // d) print names uppercase
        namesList.stream().map(name -> name.toUpperCase()).forEachOrdered(name -> System.out.println(name + ""));

        // e) remove first and last letter, sort and print names
        namesList.stream().map(name -> name.substring(1, name.length()-1)).sorted().forEach(name -> System.out.println(name + " "));

        // f) sort backwards by implementing reverse Comparator and using lambda expression
        // names list sorted backwards
        namesList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach (s-> System.out.println(s));

        // number list sorted backwards
        numberList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach (s-> System.out.println(s));



    }
}

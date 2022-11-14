package org.sda.generics.homework;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Create a file "lorem ipsum" paragraph within: it can be done by copy-pasting existing paragraph or generating it dynamically by using Java library
 * Read that file
 * Count words
 * Count special signs (like comma, dot, spaces)
 * Select one word and print it's number of occurences
 * @ author Kätlin Padesaar-Korela
 */

public class LoremIpsum {
    public static void main(String[] args) throws IOException {


        File absoluteFile = new File("C:\\Users\\37253\\java-advanced\\src\\main\\resources\\loremIpsum.txt");
        File relativeFile = new File("loremIpsum.txt");


        //Reading a file and Counting words

        try (Scanner scanner = new Scanner(new FileInputStream(absoluteFile))) {
            int counter = 0;
            while (scanner.hasNext()) {
                scanner.next();
                counter++;
            }
            System.out.println("The are " + counter + " in the document");
        }

        //Count special signs (like comma, dot, spaces)

        Scanner document = new Scanner(new File("C:\\Users\\37253\\java-advanced\\src\\main\\resources\\loremIpsum.txt"));
       // StandardCharsets.US_ASCII

        List<String> specialChar = Files.readAllLines(absoluteFile.toPath(), StandardCharsets.US_ASCII);
        List<String> specialCharASCII = new ArrayList<>();
        specialCharASCII.add(32, "space");
        specialCharASCII.add(44, "comma");
        specialCharASCII.add(45, "dot");

        while (document.hasNext()) {



        }


        //Select one word and print it's number of occurences

        String word = "luctus";
        int wordOccurrence = 0;
        int totalCount = 0;

        File file = new File("C:\\Users\\37253\\java-advanced\\src\\main\\resources\\loremIpsum.txt");

        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            totalCount++;
            if (scanner.next().equals(word)) {
                wordOccurrence++;
            }
        }
        System.out.println("The word -luctus- appears in document:  " + wordOccurrence + " times.");
    }
    }








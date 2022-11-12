package org.sda.generics.homework;

import org.sda.generics.Fruit;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;



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
        String[] words = null;
        int wordCount = 0;
        FileReader fileReader = new FileReader(absoluteFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String string;

        while((string= bufferedReader.readLine()) !=null){
            words=string.split( " ");
            wordCount = wordCount + words.length;
        }

        System.out.println("There are " + wordCount + " words in the file.");

        //Count special signs (like comma, dot, spaces)


        //Select one word and print it's number of occurences

        FileReader fileReader2 = new FileReader(absoluteFile);
       // fileReader2 =
       // String word = "luctus";
       // System.out.println(countOccurrences(str, word));
    }



    static int countOccurrences(String str, String word)
    {
        // split the string by spaces in a
        String a[] = str.split(" ");

        // search for pattern in a
        int count = 0;
        for (int i = 0; i < a.length; i++)
        {
            // if match found increase count
            if (word.equals(a[i]))
                count++;
        }

        return count;
    }



}

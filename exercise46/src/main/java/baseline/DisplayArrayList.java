/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Jonathan O'Leary
 */
package baseline;

import java.util.ArrayList;

public class DisplayArrayList {
    public static void DisplayArray(ArrayList<String> words, ArrayList<Integer> count) {

        for (int i = 0; i < words.size(); i++) {
            System.out.print(words.get(i) + ": ");
            for (int j = 0; j < count.get(i); j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}

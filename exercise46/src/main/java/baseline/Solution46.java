/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Jonathan O'Leary
 */
package baseline;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Solution46 {

    public static void main(String[] args) throws IOException {

        FileInputStream fileIN = new FileInputStream("Data/exercise46_input.txt");
        Scanner scanR = new Scanner(fileIN);

        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();

        while (scanR.hasNext())
        {
            String nextWord = scanR.next();

            if(words.contains(nextWord))
            {
                int index = words.indexOf(nextWord);
                count.set(index, count.get(index)+ 1);
            }
            else
            {
                words.add(nextWord);
                count.add(1);
            }
        }
        scanR.close();
        fileIN.close();
        DisplayArrayList.DisplayArray(words,count);
    }
}

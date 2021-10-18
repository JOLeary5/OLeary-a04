/*
 * UCF COP3330 Fall 2021 Assignment 3 Solutions
 * Copyright 2021 Jonathan O'Leary
 */
package baseline;

import java.io.*;
import java.util.*;

public class displayArray
{
    static void displayArrayList(ArrayList<String> namesList) throws IOException {
        FileWriter output = new FileWriter("Data/exercise41_output.txt");

        output.write("Total of " + namesList.size() + " names\n");

        output.write("--------------------\n");

        for(String i: namesList)
        {
            output.write(i+"\n");
        }

        output.close();
    }
}

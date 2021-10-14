/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Jonathan O'Leary
 */

package baseline;

import java.util.*;
import java.io.*;



public class Solution42
{

    // LoadStringArray();
    public static void LoadStringArray(Scanner input, ArrayList<String> namesList)
    {
        while (input.hasNextLine())
        {
            // - load contents of file in an array
            namesList.add(input.nextLine());
        }
    }




    public static void main(String[] args) throws FileNotFoundException {

        // - load in file

        Scanner inputFile = new Scanner(new File("Data/exercise42_input.txt"));
        ArrayList<String> namesList = new ArrayList<String>();

        LoadStringArray(inputFile, namesList);

        DisplayInfo DisplayInfoObject = new DisplayInfo();

        DisplayInfo.displayFileInfo(namesList);



    }
}

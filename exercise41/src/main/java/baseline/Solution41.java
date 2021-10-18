/*
 * UCF COP3330 Fall 2021 Assignment 3 Solutions
 * Copyright 2021 Jonathan O'Leary
 */

package baseline;
import java.io.*;
import java.util.*;

public class Solution41 {

    public static void LoadStringArray(Scanner input, ArrayList<String> namesList) {

        while (input.hasNextLine()) {
            // - load contents of file in an array
            namesList.add(input.nextLine());
        }

    }

    public static void AlphabetizeArray(ArrayList<String> namesList) {
        Collections.sort(namesList);
    }

    public static void main(String[] args) throws FileNotFoundException {


        Scanner inputFile = new Scanner(new File("Data/exercise41_input.txt"));
        ArrayList<String> namesList = new ArrayList<String>();

        LoadStringArray(inputFile, namesList);

        AlphabetizeArray(namesList);

        try
        {
            displayArray.displayArrayList(namesList);
        }

        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    //  **** USE J-UNIT 5 TO UNIT TEST *****
}
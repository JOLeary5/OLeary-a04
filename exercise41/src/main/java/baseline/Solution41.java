/*
 * UCF COP3330 Fall 2021 Assignment 3 Solutions
 * Copyright 2021 Jonathan O'Leary
 */

package baseline;
import java.io.*;
import java.util.*;

public class Solution41 {

    // LoadStringArray();
    public static void LoadStringArray(Scanner input, ArrayList<String> namesList) {

        while (input.hasNextLine()) {
            // - load contents of file in an array
            namesList.add(input.nextLine());
        }

    }

    public static void AlphabetizeArray(ArrayList<String> namesList) {
        // - take the Array given and alphabetize it;
        Collections.sort(namesList);
    }

    public static void main(String[] args) throws FileNotFoundException {


        // - load in file
        Scanner inputFile = new Scanner(new File("Data/exercise41_input.txt"));
        ArrayList<String> namesList = new ArrayList<String>();

        // LoadStringArray();
        LoadStringArray(inputFile, namesList);

        // AlphabetizeArray();
        AlphabetizeArray(namesList);

        // DisplayArray();
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
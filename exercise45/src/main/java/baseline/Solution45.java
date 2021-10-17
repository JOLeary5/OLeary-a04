/*
 * UCF COP3330 Fall 2021 Assignment 3 Solutions
 * Copyright 2021 Jonathan O'Leary
 */

package baseline;

import java.io.*;
import java.util.*;


public class Solution45 {

    public static void InputFileCopy(String fileName) throws IOException {
        FileReader fileIN = new FileReader("Data/exercise45_input.txt");
        FileWriter fileOUT = new FileWriter("Data/"+fileName, true);

        int c;
        while ((c = fileIN.read()) != -1) {
            fileOUT.write(c);
        }
        System.out.println("Copy finish...");
        fileIN.close();
        fileOUT.close();

    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        //prompt for name of the file
        System.out.print("Please name the output file:");
        String fileName = sc.next();

        //FUNCTION InputFileCopy
        InputFileCopy(fileName);

        // CLASS FindAndReplace
        FindAndReplace.FindAndReplaceWithHashmaps(fileName);



    }
}

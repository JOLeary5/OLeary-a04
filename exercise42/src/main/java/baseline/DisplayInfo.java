/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Jonathan O'Leary
 */

package baseline;

import java.util.ArrayList;

public class DisplayInfo {
    public static void displayFileInfo(ArrayList<String> strings){

        String num;

        System.out.printf("%-17s%-17s%-17s\n", "Last", "First", "Salary");
        System.out.println("----------------------------------------");

        for ( int i = 0; i<strings.size() ; i++){

            num = strings.get(i);
            String[] temp = num.split(",");
            System.out.printf("%-17s%-17s%-17s\n", temp[0], temp[1], temp[2]);

        }
    }
}

/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Jonathan O'Leary
 */

package baseline;

import java.io.*;
import java.util.Scanner;

public class Solution43 {

    //Load Site Name
    public static String LoadSite() {

        Scanner scanR = new Scanner(System.in);
        System.out.println("Site name");

        return scanR.next();
    }

    //Load Authors Name
    public static String LoadAuthor() {
        Scanner scanR = new Scanner(System.in);
        System.out.println("Author name");

        return scanR.next();
    }


    public static void main(String[] args) throws IOException {

        //FUNCTION SITENAME
        String siteName = LoadSite();

        //FUNCTION AUTHORNAME
        String authorName = LoadAuthor();

        //CLASS Create.HTML
        createHTML.createHTMLFile(siteName, authorName);


    }
}

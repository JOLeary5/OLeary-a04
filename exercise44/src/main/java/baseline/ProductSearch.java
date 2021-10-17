/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Jonathan O'Leary
 */
package baseline;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;

public class ProductSearch {
    public static void JSONProductSearch(JSONArray products){

        // Use a buffered reader to take input
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String input;
            int flag = 0;

            // Prompt and take user product Name
            System.out.print("What is the product name? ");
            input = bufferedReader.readLine();
            Iterator iterator = products.iterator();

            // !!!!!CREATE AN ITERATOR TO LOOP THROUGH PRODUCTS ARRAY!!!!!!!!!!!
            while (iterator.hasNext())
            {
                //       - Use ITERATOR TO SEARCH THE JSON PRODUCT LIST
                JSONObject json = (JSONObject)iterator.next();

                //       - STRING name = json.get(NAME)
                String name = (String)json.get("name");

                if(input.equalsIgnoreCase(name))
                {
                    System.out.println("Name: "+name);
                    System.out.println("Price: "+json.get("price"));
                    System.out.println("Quantity: "+json.get("quantity"));
                    flag = 1;
                }
            }
            //       if (flag ===0){
            if (flag ==0){
                System.out.println("Sorry, that product was not found in our inventory");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }



        // Prompt and take user product Name



        // While (Iterator.hasNext()) {                             (GOOGLED THIS SOLUTION)
        //
        //       - Use ITERATOR TO SEARCH THE JSON PRODUCT LIST
        //       - STRING name = json.get(NAME)
        //       - While( itereator has next)
        //                  - compare value with given input
        //                       - if (input to lowerCase equals (snametolower)
        //                             - sout NAME
        //                             - sout price
        //                             - get quantity
        //                             - flag = 1;
        //       if (flag ===0){
        //              sout("PRODCUT NOT FOUND")
        //        }
        //


    }
}

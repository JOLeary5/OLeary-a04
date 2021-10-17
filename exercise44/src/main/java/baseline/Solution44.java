/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Jonathan O'Leary
 */

package baseline;

import java.io.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class Solution44
{
    public static JSONArray LoadProductList()
    {
        JSONArray products = null;
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("Data/exercise44_input.json"));
            JSONObject jsonObject = (JSONObject)obj;
            products = (JSONArray) jsonObject.get("products");


        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
        return products;
    }

    public static void main(String[] args){

        //FUNCTION READ-JSON FILE
        JSONArray productList = LoadProductList();

        ProductSearch.JSONProductSearch(productList);

    }
}

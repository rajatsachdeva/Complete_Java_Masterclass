package com.rajatsachdeva;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Gson gson = new Gson();
        Buys buys = new Buys();

        buys.open();

        try {

            String jsonString = " { " +
                    "'Buys': " +
                    "{ " +
                        "'bHeading1': " +
                            "{'bkey1': 'value1', " +
                            "'bkey2': 'value2', " +
                            "'bkey3': 'value3'}," +
                        "'bbHeading2': " +
                            "{ 'bbkey1': 'value1', " +
                            "'bbkey2': 'value2', " +
                            "'bbkey3': 'value3' } " +
                    "} " +
                    "}";

            // convert to java class
            System.out.println("String: " + jsonString);
            Proposal obj = gson.fromJson(jsonString, Proposal.class);
            System.out.println("OBJECT : " + obj);

            // convert to json
            String jsonStringFromObj = gson.toJson(obj);
            System.out.println("JSON : " + jsonStringFromObj);
            buys.insertIntoHeading(obj);
            buys.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

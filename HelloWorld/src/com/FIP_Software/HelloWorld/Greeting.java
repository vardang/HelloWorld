package com.FIP_Software.HelloWorld;

import java.io.*;


/**
 * Created by vardang on 6/21/16.
 */
public class Greeting {



    private String readFromFile (){

        String someGreeting = null;

        File confProop = new File("config.properties");
        BufferedReader bufReader = null;

        try {

            FileReader flReader = new FileReader(confProop);
            bufReader = new BufferedReader(flReader);
            someGreeting = bufReader.readLine();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + confProop.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file: " + confProop.toString());
        }

        try {
            bufReader.close();
        } catch (IOException e) {
            System.out.println("Unable to close file: " + confProop.toString());
        }



        return someGreeting;

    }


    public String toString(){

        return readFromFile();
    }
}

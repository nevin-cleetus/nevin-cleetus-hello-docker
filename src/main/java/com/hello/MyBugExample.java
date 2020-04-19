package com.hello;

import java.io.*;


public class MyBugExample{

    public static void main(String args[]){
 
       BufferedReader buffReader = null;
       try {
           String fileName = System.getProperty("property.file");
           buffReader = new BufferedReader(new FileReader(fileName));
           while (buffReader.readLine() != null) { // Noncompliant
              // ...
           }
       } catch (IOException e) {
           // ...
       }
    }
}

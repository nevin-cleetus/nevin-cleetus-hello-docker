package com.hello;
import java.util.*;

public class MyCodeSmellExample {

    public static void main(String args[]){

      String color = "blue";
      String name = "ishmael";
      List<String> strings = new ArrayList<String> ();
      strings.add(color);
      strings.add(name);
      if (strings.indexOf(color) > 0) {  // Noncompliant
          // ...
      }

    }
}


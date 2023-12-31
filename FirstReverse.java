/* First Reverse
   Date:(28.10.2023)
Have the function FirstReverse(str) take the str parameter being passed and return the string in reversed order. 
For example: if the input string is "Hello World and Coders" then your program should return the string sredoC dna dlroW olleH.   */

import java.util.*; 
import java.io.*;

class Main {

  public static String FirstReverse(String str) {
    // code goes here  

    /* 1. use StringBuilder() method or StringBuffer() method, then reverse, then convert back to string using toString() method and return it. */
      return new StringBuilder(str).reverse().toString(); 
      // return new StringBuffer(str).reverse().toString(); 
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }

}

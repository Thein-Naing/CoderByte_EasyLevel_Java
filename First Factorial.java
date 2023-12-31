/*  First Factorial
easy 
Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it. 
For example: if num = 4, then your program should return (4 * 3 * 2 * 1) = 24. For the test cases, 
the range will be between 1 and 18 and the input will always be an integer.

Examples
Input: 4
Output: 24
Input: 8
Output: 40320

Tags
recursion math fundamentals */

import java.util.*; 
import java.io.*;

class Main {

  public static int FirstFactorial(int num) {
    // code goes here  
  int result = 1;
  while ( num > 0)  {
    result *= num; // result = result * num
    num--;
  }
  return result;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstFactorial(s.nextLine())); 
  }

}

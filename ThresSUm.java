/* Three Sum

Have the function ThreeSum(arr) take the array of integers stored in arr, and determine if any three distinct numbers (excluding the first element) 
in the array can sum up to the first element in the array.
For example: if arr is [8, 2, 1, 4, 10, 5, -1, -1] then there are actually three sets of triplets that sum to the number 8: [2, 1, 5], [4, 5, -1] and [10, -1, -1].
Your program should return the string true if 3 distinct elements sum to the first element, otherwise your program should return the string false. 
The input array will always contain at least 4 elements. */

import java.util.*; 
import java.io.*;

class Main {

  public static int ThreeSum(int[] arr) {
    // code goes here  
    // return arr[0];
String result = "";

    for let(i =1; i < arr.length; i++) {
      for ( j= i +1; j < arr.length; j++) {
        for ( k = j+1;  k < arr.length; k++) {
          if (arr[i] + arr[j] + arr[k] === arr[0]) {
        return true;
        }
      }
    } 
  }
  return false;

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ThreeSum(s.nextLine())); 
  }

}

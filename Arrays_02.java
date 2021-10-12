
// Write a Java program to sum values of an array. //

import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
  // Write your code here
  int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
  int sum = 0;
  for(int i : array)
    sum+= i;
  System.out.println("Sum of the array : " + sum);  
  
 }
}


// Write a Java program to calculate the average value of array elements//

import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
  // Write your code here
  int[] array = {1,2,3,4,5,6,7,8,9};
  int sum = 0;
  for(int i =0; i < array.length; i++){
  sum+=array[i];
  }
  int average = sum/array.length;
  System.out.println("The average of the array is : " +average);
 }
}
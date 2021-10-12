// print the numbers in given pattern 
 0  0  0  0  0  0  0  0  0  0 
 0  0  0  0  0  0  0  0  0  0 
 0  0  0  0  0  0  0  0  0  0 
 0  0  0  0  0  0  0  0  0  0 
 0  0  0  0  0  0  0  0  0  0 
 0  0  0  0  0  0  0  0  0  0 
 0  0  0  0  0  0  0  0  0  0 
 0  0  0  0  0  0  0  0  0  0 
 0  0  0  0  0  0  0  0  0  0 
 0  0  0  0  0  0  0  0  0  0 
//

import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
  // Write your code here
  int [][]array = new int[10][10];
  for(int i = 0; i < 10; i++)
  {
    for(int j = 0; j < 10; j++)
    {
      System.out.printf("%2d ", array[i][j]);
    }
    System.out.println();
  }
 }
}
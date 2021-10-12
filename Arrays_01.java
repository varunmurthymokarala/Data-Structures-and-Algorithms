import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
  // Write your code here
  int array1[] = {1200, 200, 450, 600, 40};
  String array2[] = {"abc", "zfg", "acb", "bbb", "zzz"};
  System.out.println("Original numeric array : "+ Arrays.toString(array1));
  Arrays.sort(array1);
  System.out.println("Sorted array: "+Arrays.toString(array1));
  System.out.println("Original Character array : "+Arrays.toString(array2));
  Arrays.sort(array2);
  System.out.println("Sorted character array : "+Arrays.toString(array2));
 }
}
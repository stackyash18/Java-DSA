
package Array;
import java.util.Scanner;


class ArrayUtility {

  public static int[] inputArray()
  {
  Scanner input = new Scanner(System.in);
  System.out.println("Please enter the number of element: ");
  int n = input.nextInt();

  int[] arr = new int[n];
  int i=0;
  while(i<n)
  {
    System.out.println("Please enter the element no." + (i+1) + ":" );
    arr[i]=input.nextInt(); 
    i++;
  }
  input.close();
  return arr;
}

}

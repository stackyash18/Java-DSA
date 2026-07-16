import java.util.Scanner;

public class PrintEvenSkipOdd {
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    
    int arr[] = {125,226,452,363,452,661,456,854,754,785};

    for(int i=0; i<arr.length; i++)
    {
      if(arr[i]%2==0)
      {
        System.out.println(arr[i]);
      }
      else
      {
        continue;
      }
    }
    input.close();
  }
}

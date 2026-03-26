package DSA.Patterns;
import java.util.Scanner;

/*
Pattern1.   - - - - - -> m
          |  * * * * *  
          |  * * * * *  
          |  * * * * * 
          |  * * * * * 
                                                       */
public class A {
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the No. of Rows: ");
    int n = input.nextInt();
    System.out.println("Enter the No. of Columns: ");
    int m = input.nextInt();
      input.close();

    for(int i=0; i<n; i++)
    {
      System.out.print("     ");
      for(int j=0; j<m; j++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

}

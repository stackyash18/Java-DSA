package DSA.Patterns;
import java.util.Scanner;

/*
Pattern1.    * * * * *
             * * * * *  
             * * * * * 
             * * * * * 
                                     */
public class A {
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<4; i++)
    {
      for(int j=0; j<4; j++)
      {
        System.out.print("   *");
      }
      System.out.println();
    }
  }
  
}

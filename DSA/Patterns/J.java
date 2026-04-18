package DSA.Patterns;

/* 
Pattern 10.
        * 
      * * * 
    * * * * *
  * * * * * * *
    * * * * * 
      * * * 
        * 
*/
public class J {
  public static void main(String args[])
  {
       //Part 1
     int n=4;
  
  for(int row=1; row<=n; row++){
    for(int col=1; col<=n-row; col++)
    {
      System.out.print("  ");
    }
    for(int col=1; col<=(2*row)-1;col++)
    {
      System.out.print("* ");
    }
    System.out.println();
  }
   int m=3;
   for(int i =1; i<=m; i++)
   {
    for(int j=1; j<=i; j++)
    {
      System.out.print("  ");
    }
    for(int j=1; j<=7-2*i; j++)
    {
      System.out.print("* ");
    }
    
    System.out.println();
   }
  }
}

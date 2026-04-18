package DSA.Patterns;

/* 
Pattern 16.
E
E D
E D C
E D C B
E D C B A
*/
public class P {
  public static void main(String args[])
  {
    int n=5;
    for(int i=1; i<=n; i++)
  {
    for(int j=1; j<=i; j++)
    {
     int a=j;
     int b=('E'+1);
     int ans = b - a;
     char finalAns = (char)ans;
     System.out.print(finalAns + " ");
    }
    System.out.println();
  }
  }
}

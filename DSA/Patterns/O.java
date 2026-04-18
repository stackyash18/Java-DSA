package DSA.Patterns;
/* 
Pattern 15.
     A
     A B
     A B C
     A B C D
     A B C D E
*/
public class O {
  public static void main(String args[])
  {
    int n=5;
  for(int i=1; i<=n; i++)
  {
    for(int j=1; j<=i; j++)
    {
     int a=j;
     int b=('A'-1);
     int ans = a + b;
     char finalAns = (char)ans;
     System.out.print(finalAns + " ");
    }
    System.out.println();
  }
  }
}

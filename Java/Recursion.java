import java.util.Scanner;

public class Recursion {
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number to find the factorial of: ");
    int num = input.nextInt();

    long fact = factorial(num);
    System.out.println("The factorial of " + num + " is: " + fact);
    input.close();
  }

  public static long factorial(int num)
  {
    if(num==1)
    {
      return 1;
    }
    System.out.println("Function called for: " + num);
    return num*factorial(num-1);
  }
  
}

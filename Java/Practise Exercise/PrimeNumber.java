import java.util.Scanner;

public class PrimeNumber {
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number: ");
    int num = input.nextInt();
    boolean isPrime = isPrime(num);

    if(isPrime)
    {
      System.out.println( num  + " is prime number.");
    }
    else
    {
      System.out.println( num  + " is not prime number.");
    }

    input.close();

  }
  public static boolean isPrime(int num)
  {
    for(int i=2; i<num; i++)
    {
      if(num%i==0)
      {
        return false;
      }
    }
    return true;
  }
}

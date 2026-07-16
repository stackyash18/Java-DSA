import java.util.Scanner;

public class Fibonacci {
  static int fibonacci(int n) {
    System.out.print("."); //want to see how much time the function called
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = input.nextInt();
    for(int i=0; i<=n; i++)

      {
        System.out.println(fibonacci(i) + " ");
      }
    
    input.close();
  }
}

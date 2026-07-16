import java.util.Scanner;

public class Fibonacci {
  static int fibonacci(int n) {
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
    int n = input.nextInt();
    int result = fibonacci(n);
    System.out.println("Fibonacci number at position " + n + " is: " + result);
    input.close();
  }
}

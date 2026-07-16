import java.util.Scanner;

public class MaxNumInArr {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    int arr[] = { 12, 45, 15, 326, 485, 78, 285, 785, 995, 885 };
    int max = 0;
    for (int num : arr) {
      if (num > max) {
        max = num;
      }
    }
    System.out.println("the maximum number in array is: " + max);

    input.close();
  }
}

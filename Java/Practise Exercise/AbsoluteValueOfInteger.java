import java.util.Scanner;

public class AbsoluteValueOfInteger {
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = input.nextInt();

    int result = absValue(num);
    System.out.println("The absolute value of the entered integer is: " + result);

    input.close();

  }
  public static int absValue(int num)
  {
   int result;
   if(num<0)
   {
     result = Math.abs(num);
   }
   else
   {
    result = num;
   }
   return result;
  }
}

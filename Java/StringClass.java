public class StringClass {
  public static void main(String args[])
  {
    String name = "Yash";
    int rank = 325;
    //this is the concatenation method which consumes more memory space.
    System.out.println("Hello " + name + ", Your all india rank is " + rank + ".");
    //this is the better method which consumes less memory as compare to concatenation method.
    System.out.printf("Hello %s, Your all india rank is %d.",name,rank);
  }
}

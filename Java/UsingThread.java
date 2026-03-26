class MyThread1 extends Thread
{
  public void run()
  {
    int i =0;
    while(i<1000)
    {
      System.out.println("My Thread1 is Running.");
      System.out.println("Hello, I Am Yash.");
      i++;
    }
  }
}
class MyThread2 extends Thread
{
  public void run()
  {
    int i = 0;
    while(i<1000)
    {
      System.out.println("My Thread2 is Running.");
      System.out.println("Hello, I Am Yash Tomar.");
      i++;
    }
  }
}
public class UsingThread {
public static void main(String args[])
{
 MyThread1 name = new MyThread1();
 MyThread2 fname = new MyThread2();

 name.start();
 fname.start();
}  
}

/* 
  Summary Table Link -  https://docs.google.com/document/d/1LYD1spDHk7oGvAsjbj8S6Zvh-HjYliO6htYxG6qqQEQ/edit?usp=sharing
*/
class MyRunnable implements Runnable
{
  String name;

  MyRunnable(String name)
  {
    this.name = name;
  }

  public void run()
  {
    for(int i=1; i<=10; i++)
    {
      System.out.println("Thread Running: " + name);
    }
  }
}
public class ThreadConstructor {
  public static void main(String args[])
  {
  MyRunnable obj = new MyRunnable("yash");
   Thread t1 =  new Thread(obj);
   t1.start();
  }
}

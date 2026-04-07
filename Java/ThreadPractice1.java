class PracticeA extends Thread
{
 public void run()
 {
  while(true)
  {
    try
    {
      PracticeA.sleep(20);
    }
    catch (Exception e)
    {
      System.out.println(e);
    }
    System.out.println("Good Morning.");
  }
 }
}

class PracticeB extends Thread
{
 public void run()
 {
  while(true)
  { 
    try
    {
      PracticeA.sleep(20);
    }
    catch (Exception e)
    {
      System.out.println(e);
    }
    System.out.println("Welcome.");
  }
 }
}

public class ThreadPractice1 {
  public static void main(String args[])
  {
  PracticeA p1 = new PracticeA();
  PracticeB p2 = new PracticeB();

  p1.start();
  p2.start();
  }
}

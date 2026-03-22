interface MyCamera2
{
  void takeSnap();
  void recordVideo();
}

interface MyWifi2
{
  String[] getNetworks();
  void connectToNetwork(String networks);
}

class MyCellPhone2
{
  void callNumber(long phoneNumber)
  {
    System.out.println("Calling " + phoneNumber);
  }
  void pickCall()
    {
      System.out.println("Connecting...");
    }
  
}

 class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2
 {
  public void takeSnap()
   {
    System.out.println("Taking Snap");
   }
   public void recordVideo()
   {
    System.out.println("Recording Video");
   }

   public String[] getNetworks()
   {
    System.out.println("Getting List of Networks");
    String[] networkList = {"Harry", "Arjun", "Yash", "Karn"};
    return networkList;
   }

   public void connectToNetwork(String network)
   {
    System.out.println("Connecting to " + network);
   }
 }
public class Polymorphism
{
 public static void main(String args[])
 {
  MyCamera2  nokia = new MySmartPhone2(); //The Smartphone's Features has been restricted according to the usage.
  nokia.recordVideo();
 }
}
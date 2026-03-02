interface Bicycle
{
  void applyBrakes(int decreement);
  void speedUp(int increement);
}
class AvonCycle implements Bicycle
{
  int speed = 7;

 void blowHorn()
 {
  System.out.println("Pee Pee Poo Poo");
 } 
 public void applyBrakes(int decreement)
  {
    speed = speed - decreement;
    System.out.println("Speed after Applying Brakes: " + speed);
  }
  public void speedUp(int increement)
  {
    speed = speed + increement;
    System.out.println("Speed after Speeding up: " + speed);
  }
}
public class InterfaceInJava {
  public static void main(String args[])
  {
  Bicycle cycle = new AvonCycle();
  
  cycle.applyBrakes(5);
  cycle.speedUp(7);
  }
}

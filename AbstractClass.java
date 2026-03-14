abstract class Pen
{
  abstract void write();
  abstract void refill();
}
class FountainPen extends Pen
{
  void write()
  {
  System.out.println("Your can write with Fountain Pen.");
  }
  void refill()
  {
    System.out.println("Refill the Fountain Pen.");
  }
  void changeNib()
  {
    System.out.println("You have to change the nib of  Fountain Pen.");
  }
}

class CelloPen extends Pen
{
  void write()
  {
  System.out.println("Your can write with Cello Pen.");
  }
  void refill()
  {
    System.out.println("Refill the Cello Pen.");
  }
  void changeNib()
  {
    System.out.println("You have to change the nib of  Cello Pen.");
  }
}

public class AbstractClass
{
  public static void main(String args[])
  {

  FountainPen pen = new FountainPen();
  pen.refill();
  pen.changeNib();
  

  CelloPen pen2 = new CelloPen();
  pen2.changeNib();
  pen2.write();

  }
}
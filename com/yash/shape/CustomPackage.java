package com.yash.shape;

class Circle
{
  private double radius;

  public double getRadius()
  {
    return radius;
  }
  public void setRadius(double radius)
  {
    this.radius = radius;
  }

  public void calculateCircumference()
  {
    double circumference = 2 * Math.PI * radius;
    System.out.println("The Circumference of the Circle: " + circumference);
  }
  public void  calculateArea()
  {
   double area = 2 * Math.PI * radius * radius;
   System.out.println("The Area of Circle is: " + area);
  }
}
class Rectangle
{
  private int length;
  private int breadth;

  public int getLength(int length)
  {
   return length;
  }
  public int getBreadth(int breadth)
  {
    return breadth;
  }

  public void setLength(int length)
  {
    this.length = length;
  }
  public void setBreadth(int breadth)
  {
    this.breadth = breadth;
  }

  public void calculateArea()
  {
    int area = length*breadth;
    System.out.println("The Area of the Rectangle: " + area);
  }
  public void calculatePerimeter()
  {
     int perimeter = 2*(length+breadth);
     System.out.println("The Perimeter of the Rectanlge: " + perimeter);
  }
  public void calculateDiagonal()
  {
    double diagonal = Math.sqrt(breadth*breadth + length*length);
    System.out.println("The Diagonal of the Rectangle: " + diagonal);
  }

}

class Square
{
  private int side;

  public int getSide(int side)
  {
    return side;
  }
  public void setSide(int side)
  {
    this.side = side;
  }

  public void calculateArea()
  {
   int area = side*side;
   System.out.println("Th Area of  the Square :" + area);
  }

  public void calculatePerimeter()
  {
     int perimeter = 4*side;
     System.out.println("The Perimeter of the Square :" + perimeter);
  }

  public void calculateLengthOfDiagonal()
  {
    double diagonal = side * Math.sqrt(2);
    System.out.println("The Diagonal Length of the Square is: " + diagonal);
  }
}
class Cylinder extends Circle
{
  private double height;

  public double getHeight(double height)
  {
    return height;
  }
  public void setHeight(double height)
  {
    this.height = height;
  }

  public void calculateVolume()
  {
    double volume = Math.PI * getRadius() * getRadius() * height;
    System.out.println("The Volume of the Cylinder: " + volume);
  }

  public void calculateCurvedSurfaceArea()
  {
    double CSA = 2 * Math.PI * getRadius() * height;
    System.out.println("The C.S.A of Cylinder: " + CSA); 
  }

  public void calculateTotalSurfaceArea()
  {
    double TSA = (2 * Math.PI * getRadius() * ( getRadius() *+ height)); 
    System.out.println("The T.S.A of Cylinder: " + TSA);
  }

  public void calculateBaseArea()
  {
    double baseArea = Math.PI * getRadius() * getRadius();
    System.out.println("The Base Area of Cylinder is: " + baseArea);
  }
}
class Sphere extends Cylinder
{
  public void calculateSurfaceArea()
  {
    double surfaceArea = 4 * Math.PI * getRadius() * getRadius();
    System.out.println("The Surface Area of Sphere: " + surfaceArea);
  }
}
/* 
  *** THIS CODE SHOULD WRITE IN NOTEPAD ***
You have to create a package named yash.in.shape
This package should have individual classes for Rectangle, Square,Circle, Cylinder, Sphere
These classes should use inheritance  to properly manage the code!
Include method like volume,surfaceArea and getters/setters for dimensions 
*/
public class CustomPackage {

  public static void main(String args[])
  {
   
  }
}

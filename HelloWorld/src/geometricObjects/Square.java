package geometricObjects;

public class Square implements GeometricObject 
{	
	protected double side;
	
	Square(double side)
	{
		this.side = side;
	}
	
	public double getArea() 
	{
		double area =  side * side;
		return area;
	}

	public double getPerimeter() 
	{
		double perimeter = side * 4;
		return perimeter;
	}
	/*
	public String printerSquare()
	{
		System.out.print("The area is" + getArea() + " with perimeter" + getPerimeter());
		return printerSquare();
	}
	*/
	public String toString()
	{
		return "This square perimeter: " + getPerimeter() + " Area:" + getArea();
	}
}
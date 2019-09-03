package geometricObjects;

import java.text.DecimalFormat;

public class Circle implements GeometricObject 
{
	protected double radius;
	DecimalFormat dec = new DecimalFormat("#0.00");
	
	Circle(double radius)
	{
		this.radius = radius;
	}
	
	
	public double getArea() {
		double area = Math.PI * radius;
		String x = dec.format(area);
		area = Double.parseDouble(x);
		return area; 
	}
	
	public double getPerimeter() {
		double perimeter = Math.PI * radius * 2;
		String x = dec.format(perimeter);
		perimeter = Double.parseDouble(x);
		return perimeter;
		
	}
	/*
	public String printerCircle()
	{
		System.out.print("The area is" + getArea());
		System.out.println(" with perimeter" + getPerimeter());
		return printerCircle();
	}
	*/
	public String toString()
	{
		return "This Circle perimeter: " + getPerimeter() + " Area:" + getArea();
	}
}

//Neo Chen \nExcecise3"
package geometricObjects;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args)
	{			
		ArrayList<GeometricObject> geoList = new ArrayList<GeometricObject>();
		//S for square
		Square s1 = new Square(100);
		Square s2 = new Square(75);
		Square s3 = new Square(50);
		Square s4 = new Square(25);
		
		//Add them to geoList
		geoList.add(s1);
		geoList.add(s2);
		geoList.add(s3);
		geoList.add(s4);

		//C for circle
		Circle c1 = new Circle(100);
		Circle c2 = new Circle(75);
		Circle c3 = new Circle(50);
		Circle c4 = new Circle(25);
		
		//Add them to geoList
		geoList.add(c1);
		geoList.add(c2);
		geoList.add(c3);
		geoList.add(c4);
		
		//Print out all the shapes in geoList
		System.out.println("The list of the GeometricObject");
		for(GeometricObject i : geoList)
		{
			System.out.println(i);
		}
	
		ArrayList<Resizable> resizeList = new ArrayList<Resizable>();
		//RS for resize square
		ResizableSquare rs1 = new ResizableSquare(100);
		ResizableSquare rs2 = new ResizableSquare(75);
		ResizableSquare rs3 = new ResizableSquare(50);
		ResizableSquare rs4 = new ResizableSquare(25);
		
		//Add them to resize list
		resizeList.add(rs1);
		resizeList.add(rs2);
		resizeList.add(rs3);
		resizeList.add(rs4);


		//RC for resize Circle
		ResizableCircle rc1 = new ResizableCircle(100);
		ResizableCircle rc2 = new ResizableCircle(75);
		ResizableCircle rc3 = new ResizableCircle(50);
		ResizableCircle rc4 = new ResizableCircle(25);
		
		//Add them to resize list
		resizeList.add(rc1);
		resizeList.add(rc2);
		resizeList.add(rc3);
		resizeList.add(rc4);

		System.out.println();
		
		//Print out all the shapes in resize list
		System.out.println("The list of the resizable list");
		for(Resizable i : resizeList)
		{
			System.out.println(i);
		}
		
		System.out.println();

		//PrintOut the shapes with 50% resize
		System.out.println("After the 50% resize");
		for(Resizable i : resizeList)
		{
			i.resize(50);
			System.out.println(i);
		}		
	}
}

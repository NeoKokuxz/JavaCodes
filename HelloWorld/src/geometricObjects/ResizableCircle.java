package geometricObjects;

public class ResizableCircle extends Circle implements Resizable
{
	ResizableCircle(double radius)
	{
		super(radius);
	}
	public void resize(int percent)
	{
		radius = (percent * 0.01) * radius; 
		//percent / 100
	}
	
	
	
}

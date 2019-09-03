package geometricObjects;

public class ResizableSquare extends Square implements Resizable
{
	ResizableSquare(double side)
	{
		super(side);
	}
	public void resize(int percent)
	{
		side = (percent * 0.01) * side; 
	}	
	
	
}

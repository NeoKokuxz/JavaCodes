package CISC3115;

public class GuessGame {
	static player p1;
	static player p2;
	static player p3;
	public void startGame()
	{
		p1 = new player();
		p2 = new player();
		p3 = new player();
		
		int p1guess = 0;
		int p2guess = 0;
		int p3guess = 0;
		boolean p1Right = false;
		boolean p2Right = false;
		boolean p3Right = false;
		
		int targetNum = (int) (Math.random()*10);
		
		//start game
		System.out.println("Game started!");
		
		while(true)
		{
			System.out.println("The number is "+ targetNum);
			p1.guess();
			p2.guess();
			p3.guess();
			
			p1guess = p1.number;
			System.out.println("P1 guessed " +p1guess);
			p2guess = p2.number;
			System.out.println("P1 guessed " +p2guess);
			p3guess = p3.number;
			System.out.println("P1 guessed " +p3guess);
			
			if(p1guess == targetNum)
			{
				p1Right = true;
			}
			if(p2guess == targetNum)
			{
				p2Right = true;
			}
			if(p3guess == targetNum)
			{
				p3Right = true;
			}
			
			if(p1Right || p2Right || p3Right )
			{
				System.out.println("we have a winner!");
				System.out.println("p1 win?" + p1Right);
				System.out.println("p2 win?" + p2Right);
				System.out.println("p3 win?" + p3Right);
				System.out.println("GameOver!");
				break;
			}
			else
			{
				System.out.println("Game goes on!");
			}
		}
		
	}
}


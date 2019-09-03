//Sheng Chen CISC1115 Assignment 2
package Assignment;

import java.io.*;
import java.util.Scanner;

public class Assignment2 
{
	public static void main(String[] args)throws IOException 
	{	//Write to a outfile called LeagueTeam
		PrintWriter outFile;
		outFile= new PrintWriter("leagueTeam.txt");
		//Declare all the value that is needed for this program
		int numWin, numLoss, numRound; 
		int idNum, numTeam, numLeft, numTotalW, numTotalL, champ;
		numTeam=0;
		double winAvg, highWA,currWA, highTeam, newWA, newLA, champWA, highChampWA;
		//Optional for keep track for the highest Win avg team 
		//and those finished their season
		highWA=0;
		highTeam=0000;
		champWA=0;
		highChampWA=0;
		champ=0000;
		//scanner input added
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter the id number of the team: ");
		idNum= input.nextInt();
		outFile.print(idNum);
		//Loop while id isn't 0
		while(idNum!=0)
		{	//Users enter input for teams
			System.out.print("Please enter the Wins: ");
			numWin=input.nextInt();
			System.out.print("Please enter the losses: ");
			numLoss=input.nextInt();
			//only store team with Win+Lose under 25 or equal
			if(numWin+numLoss<=25)
			{	
				//Write the values to outfile if condition meets
				outFile.print("\t"+numWin);
				outFile.println(" "+numLoss);
				//calculates the total rounds for game
				numRound= numWin+numLoss;
				System.out.println();
				System.out.println("Team "+idNum);
				System.out.println(numWin+ " wins and "+ numLoss+ " loses.");
				System.out.print("Total number of games played "+numRound);
				//calculate the rounds left in the season
				numLeft= 25- numRound;
				System.out.print("\t\tThe remaining game of the season is " + numLeft +".");
				//win average
				winAvg= (double) numWin / numRound;
				System.out.println();
				System.out.printf("The winning Avg is "+"%3.4f", winAvg);
				System.out.println();
					//Check if season finished or not
					if(numRound==25)
					{
						System.out.println("Team: "+idNum +" finished their season!");
						champWA= winAvg;
						if(champWA >= highChampWA)
							highChampWA=champWA;
							champ=idNum;
						
					}
					//Adding remaining games to wins or loses and their new WA
					if(numRound <=25)
					{
						numTotalW= numWin+numLeft;
						numTotalL= numLoss+numLeft;
						newWA= (double)numTotalW / 25;
						newLA= (double)numWin / 25;
						System.out.printf("if it wins all the game will be: "+numTotalW 
								+ "wins and win avg is:"+"%3.4f",newWA);
						System.out.println();
						System.out.printf("if it loses all the games will be: "+numTotalL 
								+ "loses and win avg is:"+"%3.4f",newLA);
					}
				//calculate the highest WA between 0 and 1. but not 1 or 0
				if(winAvg>0&&winAvg<1)
				{
					currWA= winAvg;
				
					//swap to the highest WA when condition meets
					if(highWA<=currWA)
						{
							highWA = currWA;
							highTeam = idNum;
						}
				}
				System.out.println();
					//check if remaining number greater or equal to number won/lost
					if( numLeft >=numWin)
					{
						System.out.println("Number of games remaining is greater or equal to number won");
					}
					else
					{
						System.out.println("Number of games remaining is not greater than number won");
					}
					if( numLeft >=numLoss)
					{
						System.out.println("Number of games remaining is greater or equal to number lost");
					}
					else
					{
						System.out.println("Number of games remaining is not greater than number lost");
					}
				//counting for all the teams
				numTeam++;
				System.out.println();
				System.out.println();
				//loop for next team
				System.out.print("Please enter next team id (enter 0 to stop) :");
				idNum= input.nextInt();
				outFile.print(idNum);
					//condition to stop the loop
					if(idNum==0)
						System.out.println("You enter 0 and program is stopped!");
			}
			//if there's more than 25 games, cout Error.
			else
			{
				System.out.println("Comepleted more than 25 games! ERROR!");
			}
		}
		//output all the info and close outfile.
		System.out.println();
		System.out.println("The total number of teams in league is "+ numTeam);
		System.out.printf("The highest WA is "+"%3.4f",highWA);
		System.out.println();
		System.out.println("The team with highest win rate is " + (int)highTeam);
		System.out.println("The team completed their season wth highest win avg is:"+ 
								champ+" and their win avg is:"+highChampWA);
		outFile.close();
	}
}
package SnakeandLadderproblem;
import java.util.Random;
public class UC_2
{
	public static void main(String[] args)
	{
		
		System.out.println("Wlcome To The Snake Ladder Game");
		Random dice = new Random();
		int number;
		for(int counter=1; counter<=5; counter++) 
		{
			number = dice.nextInt(6);
			System.out.println(number + "");
		}
	}
}

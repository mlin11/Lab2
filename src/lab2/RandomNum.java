package lab2;


import java.util.Random;

public class RandomNum
{
	public static void main(String[] args)
	{
		Random random=new Random();
		//generate two random numbers from 0 to 3
		System.out.println(random.nextInt(4));
		System.out.println(random.nextInt(4));
	}
}

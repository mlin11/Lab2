package lab2;

import java.util.Random;

public class Random3Mers
{
	public static void main(String[] args)
	{
		//Initialize count of 'AAA'
		int count = 0;
		//start the loop to generate and print out random 3mers
		for(int x=0; x <1000; x++)
		{
			//initialize 3mer
			String s="";
			//generate random 3mer
			for(int y=0; y<3;y++)
			{
				Random random=new Random();
				int n = random.nextInt(4);
				// apply switch
				switch(n)
				{
					case 0: s=s+"A";
					break;
					case 1: s=s+"G";
					break;
					case 2: s=s+"C";
					break;
					case 3: s=s+"T";
					break;
				}
				
			}
			//print out 3mer
			System.out.println(s);
			//check if it is 'AAA'; if so, increment by 1
			if(s.equals("AAA")) 
			{
				count++;
			}
		}
		//print out expect count and frequency
		double expectFreq= (double) 0.25*0.25*0.25;
		System.out.println("The expected frequency of AAA is:" + expectFreq);
		//print out total count and frequency
		System.out.println("The actual frequency of AAA is:" + count/1000f);
		
	}
}

package lab2;

import java.util.Random;

public class RandomThreeMersUnequalFreq
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
				float f = random.nextFloat();
				// apply if...else
				if((f>=0) &&(f<0.12f))
				{
					s=s+"A";
				}else if ((f>=0.12f) &&(f<0.5f))
				{
					s=s+"C";
				}else if ((f>=0.5f) &&(f<0.89f))
				{
					s=s+"G";
				// the last else-if could be changed to else	
				}else if ((f>=0.89f) &&(f<1f))
				{
					s=s+"T";
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
		//print out expect count and frequency of AAA
		double expectFreq= (double) 0.12*0.12*0.12;
		System.out.println("The expected frequency of AAA is:" + expectFreq);
		//print out total count and frequency
		System.out.println("The actual frequency of AAA is:" + count/1000f);
		
	}
}
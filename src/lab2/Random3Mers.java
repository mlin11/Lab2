package lab2;

import java.util.Random;

public class Random3Mers
{
	public static void main(String[] args)
	{
		int count = 0;
		for(int x=0; x <1000; x++)
		{
			String s="";
			
			for(int y=0; y<3;y++)
			{
				Random random=new Random();
				int n = random.nextInt(4);
				
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
			System.out.println(s);
			if(s.equals("AAA")) 
			{
				count++;
			}
		}
		System.out.println("The count of AAA is:" + count);
	}
}

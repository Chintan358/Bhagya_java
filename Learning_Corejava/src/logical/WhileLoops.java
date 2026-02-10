package logical;

import java.util.Random;

public class WhileLoops {
	public static void main(String[] args) {
		
		Random rd = new Random();
		double num=0;
		int count = 0;
		while(num<0.99)
		{
			num = rd.nextDouble(0.0,1.0);
			System.out.println(num);
			count++;
		}
		
		System.out.println(count);
		
		
	}
}

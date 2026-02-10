package logical;

public class PrimeNumber {
	public static void main(String[] args) {
		
		for(int k=3;k<=100;k++)
		{
			int num = k;
			int flag = 0;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					flag = 1;
					break;
				}
			}		
			if(flag==0)
			{
				System.out.println(num+" : number is prime");
			}
			else
			{
			//	System.out.println(num+" :number is not prime");
			}
		}
		
			
		
		
	}
}

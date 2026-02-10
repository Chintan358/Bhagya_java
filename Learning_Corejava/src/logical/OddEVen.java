package logical;

public class OddEVen {
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++)
		{
			int num = i;		
			if(num%2==0)
			{
				System.out.println(num+" : EVEN");
			}
			else
			{
				System.out.println(num+" : ODD");
			}
		}
		
		
	}
}

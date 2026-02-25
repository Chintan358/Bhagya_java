package oops;

class Calc
{
	public void msg()
	{
		System.out.println("message printing");
	}
	
	
	public void square(int a)
	{
		int sq = a*a;
		System.out.println("Square of "+a+" is "+sq);
	}
	
	public void add(int a, int b)
	{
		System.out.println("addtion of "+a+" and "+b+" is "+(a+b));
	}
	
	public String name(String name)
	{
		return "Hello,"+name;
	}
	
	public void addArray(int a[])
	{
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		
		System.out.println("sum is : "+sum);
	}
	
	
	public int[] revArray(int a[])
	{
		int b[] = new int[a.length];
		int count = 0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[count] = a[i];
			count++;
		}
		
		return b;
	}
	
	public void all(int...a)
	{
		
	}
	
	
}
public class O004_MethodManipulation {
	public static void main(String[] args) {
		
		Calc c = new Calc();
		c.msg();
		c.square(10);
		c.square(20);
		c.add(10, 20);
		c.add(100, 200);
		
		String name = c.name("Bhagya");
		System.out.println(name);
		System.out.println(c.name("test"));
		
		int a[] = {10,20,30,40,50};
		int b[] = {1,2,3,4,5};
		c.addArray(b);
		
		int k[] = c.revArray(b);
		for(int i=0;i<k.length;i++)
		{
			System.out.println(k[i]);
		}
		
		
		c.all(10,20,30,40,50,60,70,80,90);
	}
}

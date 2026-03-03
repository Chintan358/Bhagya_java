package oops;

class Calc1
{
		public void add(int a, int b)
		{
			int r = a+b;
			System.out.println("Addtion is 1 : "+r);
		}
		
		public void add(int a, int b, int c)
		{
			int r = a+b+c;
			System.out.println("Addtion is 2 : "+r);
		}
		
		public void add(int a, double b)
		{
			double r = a+b;
			System.out.println("Addtion is  3: "+r);
		}
		
		public void add(String str, int id)
		{
			System.out.println(str+id);
		}
		
		
}

public class O006_MethodOverloading {
	public static void main(String[] args) {
		
		Calc1 c = new Calc1();
		c.add(10, 20);
		c.add(10,20, 50);
		c.add(10, 12.33);
		c.add("abc", 10);
		
	}
	
	
	public static void main(int a) {
		
	}
}

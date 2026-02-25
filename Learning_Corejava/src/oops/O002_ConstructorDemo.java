package oops;

class Demo
{
	public Demo()
	{
		System.out.println("Demo constructor calling...");
	}
	
	public Demo(int a)
	{
		System.out.println("a : "+a);
	}
	
	public Demo(String name)
	{
		System.out.println("Name is : "+name);
	}
	
	public void display()
	{
		System.out.println("Runing display....");
	}
}

public class O002_ConstructorDemo {
	public static void main(String[] args) {
		
		
		Demo d = new Demo("Bhagya");
		d.display();
		
		
	}
}

package oops;

//parent - super - base
class A
{
	int a = 10;	
	public void display()
	{
		System.out.println("Display calling");
	}
}


//child - sub - derived
class B extends A
{
	int a = 50;
	public void run()
	{
		int a= 100;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		System.out.println("runing run method");
	}
}

//multilevel 
//class C extends B
//{
//	
//}

//hirarchical inheritance
//class C extends A
//{
//	
//}

//multiple - not supported in java
//class C extends A,B
//{
//	
//}



public class O005_InheritanceDemo {
	public static void main(String[] args) {
		
		
		B b = new B();
		b.run();
		b.display();
		
	}
}

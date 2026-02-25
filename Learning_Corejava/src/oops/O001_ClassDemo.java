package oops;

class Pen
{
	//data memebr / variables
	static int price = 20;
	String color = "red";
	String company = "Cello";
	
	//function memeber / methods
	void towrite()
	{
		
		System.out.println(price+" "+color+" "+company);
	}
	
	static void display()
	{
		System.out.println("running display");
	}
}



public class O001_ClassDemo {
	public static void main(String[] args) {
		
		Pen.price = 30;
		
		Pen p1 = new Pen();
		p1.color="black";
		p1.towrite();
		
		Pen p2 = new Pen();
		p2.towrite();
		
		Pen p3 = new Pen();
		p3.towrite();
			
		Pen.display();
		
		
		
	}
}

package oops;


class X
{
	public void display()
	{
		System.out.println("X display calling");
	}
}

class Y extends X
{
	@Override
	public void display() {
		System.out.println("Y display calling");
	}
}

public class O007_MethodOverriding {
	public static void main(String[] args) {
		
		
		Y y  =new Y();
		y.display();
	}
}

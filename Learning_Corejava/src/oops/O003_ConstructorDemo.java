package oops;

class Student
{
	int id;
	String name;
	
	public Student(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public void display()
	{
		System.out.println(id+" "+name);
	}
}

public class O003_ConstructorDemo {
	public static void main(String[] args) {
		
		Student st = new Student(1,"Bhagya");
		st.display();
		
		Student st1 = new Student(2,"tops");
		st1.display();
		
	}
}

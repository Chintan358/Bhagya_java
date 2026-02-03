package arrays;

public class A001_ArrayDemo {
	public static void main(String[] args) {
		
		//declaration
		//int[] a = new int[10];
		
		//initialisation
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
//		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		
		
		int a[] = {10,20,30,40,50,60};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		String subjects[] = {"Java","Python","Php","Node"};
		
		for(int i=0;i<subjects.length;i++)
		{
			System.out.println(subjects[i]);
		}
		
		char ch[] = {'A','B','C','D'};
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
	}
}

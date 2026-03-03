package exception;

public class E001_Exception {
	public static void main(String[] args) {
		
		System.out.println("Program started");
		
	
		try
		{
//			int a = 10;
//			int b = a/0;
//			System.out.println(b);
			
			int a[] = new int[5];
			a[10] = 20;
			
			
		} 
		catch(Exception e)
		{
			System.out.println("arithmatic");
		}
//		catch (ArithmeticException e) 
//		{
//			e.printStackTrace();
//		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			e.printStackTrace();
//		}
		
		System.out.println("Program ended");
		
	}
}

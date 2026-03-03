package exception;


class Test
{
	public void check() throws ClassNotFoundException
	{
		Class.forName("Demo");
	}
}
public class E002_CompileTime {
	public static void main(String[] args) {
		
		Test t = new Test();
		try {
			t.check();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
//			try {
//				Class.forName("Demo");
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		
		
		
	}
}

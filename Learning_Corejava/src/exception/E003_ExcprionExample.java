package exception;

import java.util.Scanner;

public class E003_ExcprionExample {
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number");
			int a = sc.nextInt();
			System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("done");
		
		
	}
}

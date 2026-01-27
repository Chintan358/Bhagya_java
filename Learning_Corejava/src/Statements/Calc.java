package Statements;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		
		String cont = "y";
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number 1 : ");
		int a=  sc.nextInt();
		System.out.println("enter number 2 : ");
		int b = sc.nextInt();
		System.out.println("enter your choice : ");
		System.out.println("1 : Add, 2: sub, 3 : mul, 4 : Div");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1 :
			System.out.println("Addition of "+a+" and "+b+" is :"+(a+b));
			break;
		case 2 : 
			System.out.println("Substraction of "+a+" and "+b+" is :"+(a-b));
			break;
		case 3 : 
			System.out.println("Multiplication of "+a+" and "+b+" is :"+(a*b));
			break;
		case 4 : 
			System.out.println("Division of "+a+" and "+b+" is :"+(a/b));
			break;
		default : 
			System.out.println("Invalid choice");
		}
		
		System.out.println("do you want to continue ? y or n");
		cont = sc.next();
		}while(!cont.equals("n"));
		
	}
}

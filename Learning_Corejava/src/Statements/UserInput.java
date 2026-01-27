package Statements;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int a = sc.nextInt();
        System.out.println("Enter number : ");
        double d = sc.nextDouble();
        System.out.println("enter name : ");
        String name = sc.next();
        System.out.println("enter fullname");
        sc.nextLine();
        String fname = sc.nextLine();

        System.out.println(a);
        System.out.println(d);
        System.out.println(name);
        System.out.println(fname);

        sc.close();
    }
}

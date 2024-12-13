package day15;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a value");
	int a=	scan.nextInt();
		System.out.println("enter b value");
		int b = scan.nextInt();
		System.out.println();
		Calculator cal=new Calculator();
	
		System.out.println("add :"+ cal.add(a,b));
		System.out.println("sub : " +cal.sub(a ,b));
		System.out.println("mul : " +cal.mul(a, b));
		System.out.println("div : " +cal.div(a, b));
		
	}

}

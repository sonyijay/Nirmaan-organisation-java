package day17;

import java.util.Scanner;

public class userInterface implements IExample1 {



	@Override
	public String mul(int a, int b) {
		// TODO Auto-generated method stub
		return "mul :"+(a*b)  ;
	}

	@Override
	public String div(int a, int b) {
		// TODO Auto-generated method stub
		return "div :" +(a/b);
	}

	@Override
	public String add(int a, int b) {
		// TODO Auto-generated method stub
		return "add :" +(a+b);
	}

	@Override
	public String sub(int a, int b) {
		// TODO Auto-generated method stub
		return "sub :"+(a-b);
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

	
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a value");
int a =scan.nextInt();

	System.out.println("enter b value");
	int b =scan.nextInt();
	System.out.println();
	userInterface num =new userInterface();

	

	
	System.out.println( num.add(a, b));
	System.out.println(num.sub(a ,b));
	System.out.println(num.mul(a ,b));
	try {
		
	
	System.out.println(num.div(a ,b));
	}catch(Exception e ) {
		System.out.println("divided by zero");
	}
	System.out.println( num.add(a, b));
	System.out.println(num.sub(a ,b));
	System.out.println(num.mul(a ,b));
}


}

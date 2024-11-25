package day2;

import java.util.Scanner;

public class Simplecalculator {
	public static void main(String args[]) {
	
	Scanner sc=new Scanner (System.in);
	
	System.out.println("enter your choice");
	System.out.println("enter 0 is add");
	System.out.println("enter 1 is sub");
	System.out.println("enter 2 is mul");
	System.out.println("enter 3 is div");
	System.out.println("enter 4 is modu");
	
	int key=sc.nextInt();
	

	if(key==0)
	{

		System.out.println("enter the firstNum");
		  int firstNum=sc.nextInt();
		 System.out.println("enter the secondNum");
		 int secondNum=sc.nextInt();
		
		 
	    
		int total=firstNum+secondNum;
		System.out.println("additon:"+total);
		
	}
	else if(key==1)
	{
		System.out.println("enter the firstNum");
		  int firstNum=sc.nextInt();
		 System.out.println("enter the secondNum");
		 int secondNum=sc.nextInt();
		
		
		int total=firstNum-secondNum;
		System.out.println("sub :"+total);
	}
	else if (key==2)
	{
		System.out.println("enter the firstNum");
		  int firstNum=sc.nextInt();
		 System.out.println("enter the secondNum");
		 int secondNum=sc.nextInt();
		
	
		int total=firstNum*secondNum;
		System.out.println("mul:"+total);
	}
	else if (key==3)
	{
		
		System.out.println("enter the firstNum");
		  int firstNum=sc.nextInt();
		 System.out.println("enter the secondNum");
		 int secondNum=sc.nextInt();
		
		
		int total=firstNum/secondNum;
		System.out.println("div:"+total);
	}
	else if (key==4)
	{ System.out.println("enter the firstNum");
	  int firstNum=sc.nextInt();
	 System.out.println("enter the secondNum");
	 int secondNum=sc.nextInt();
		
		int total=firstNum%secondNum;
		System.out.println("modu:"+total);
	} else
	{
		System.out.println("enter the correct choice");
	}
		
 
	
	
}
}
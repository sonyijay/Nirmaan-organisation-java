package day14;

import java.util.Scanner;

public class EmployeeManagement {
	public static void main(String[] args) {
		

	Scanner sc = new Scanner(System.in);

	Employee emp = new Employee();
	boolean istrue=true;
	while(istrue) {
	
		

		System.out.println("enter your choice");
		System.out.println(" enter 1 is add");
		System.out.println("enter 2 for update");
		System.out.println("enter 3 to show");
		System.out.println("enter 0 to exit");
		
		
		int key=sc.nextInt();
		sc.nextLine();
		
	
		switch(key) {
		case 1 :
		{
		long num=6369753137l;
			emp = new Employee("sony", "ece", 21, num);
		break;
		}
		case 2 :
		{
			
			System.out.println("enter the name :");
			String name = sc.nextLine();
			emp.setName(name);
			System.out.println("enter the deptmnt :");
			String dept = sc.nextLine();
			emp.setDept(dept);
			System.out.println(" enter the age :");
			int age = sc.nextInt();
			emp.setAge(age);
			System.out.println("enter the mobileno");
			long mobileno =sc.nextLong();
			emp.setMobileNo(mobileno);
			break;
		}
		
		case 3:{
			System.out.println(emp);
			break;
		
		}
		case 0 :{
			istrue=false;
			
			System.out.println("thank you for visting");
			break;
			}
		default:{
	System.out.println("enter your correct  choice ");
		break;	
			
		}
			
			
		}
		
	}
	}}



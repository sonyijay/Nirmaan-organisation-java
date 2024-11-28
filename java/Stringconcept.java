package day5;

import java.util.Scanner;

public class Stringconcept {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
 		System.out.println("enter the name");
 		String name=sc.nextLine();
 		{
 			System.out.println(name.substring(0,4));
 		}
		System.out.println(name.charAt(3));
	}

}

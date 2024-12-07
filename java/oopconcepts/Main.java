package oopconcepts;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Book book=new Book();
		boolean istrue=true;
		while(istrue) {
			

			System.out.println("enter your choice");
			System.out.println(" enter 1 is add");
			System.out.println("enter 2 for show");
			System.out.println("enter 3to exit");
			
			int key=sc.nextInt();
			sc.nextLine();
			

	switch(key) {
	case 1:{
		System.out.println("enter the tile");
		String title=sc.nextLine();
		book.setTitle(title);
		System.out.println("enter the author name ");
		String author=sc.nextLine();
		book.setAuthor(author);
		System.out.println("enter the price"); 
		double price=sc.nextDouble();
		book.setPrice(price);
		System.out.println("enter the number of copies");
		int numberofcopies=sc.nextInt();
		book.setNumberofcopies(numberofcopies);
		break;
	}

	case 2:{
		System.out.println(book);
		break;
	
	}
	case 3:{
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
}		
}	

	



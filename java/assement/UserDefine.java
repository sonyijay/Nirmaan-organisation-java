package assement;

import java.util.ArrayList;
import java.util.Scanner;

public class UserDefine {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Book book=new Book();
		ArrayList<Book> al=new ArrayList<Book>();
		boolean isTrue = true;
		while(isTrue) {
		System.out.println("enter your choice");
		System.out.println("enter 1 for add");
		System.out.println("enter 2 for show");
		System.out.println("enter 3 for update");
		System.out.println("enter 0 for exit");
		int key=sc.nextInt();
		sc.nextLine();
		
		
		if(key==1) {
			System.out.println("enter your book title");
			String title=sc.nextLine();
			System.out.println("enter your author name");
			String name=sc.nextLine();
		    System.out.println("enter your price");
		    double price=sc.nextDouble();
			System.out.println("enter your number of copies");
			int noofcopies=sc.nextInt();
			al.add(book=new Book(title, name, price, noofcopies));
			
		
			}else if(key==2) {
				System.out.println(al);
				
			}else if(key==3) {
				System.out.println("enter your title");
				String select=sc.nextLine();
				for(Book book1:al) {
					if(select.equalsIgnoreCase(book1.getTitle())) {
						System.out.println("rename your title");
						String title=sc.nextLine();
						book1.setTitle(title);
						System.out.println("enter your author name");
						String author=sc.nextLine();
						book1.setAuthor(author);
						System.out.println("enter your price");
						double price=sc.nextDouble();
						book1.setPrice(price);
						System.out.println("enter your number of copies");
						int noofcopies=sc.nextInt();
						book1.setNumberofcopies(noofcopies);
						break;
						
					}
				}
			}else if (key==0) {
						isTrue=false;
						System.out.println("thank you");
					}
				else {
					isTrue=false;
					System.out.println("enter your correct choice");
					break;
				}
		
		
	}
	

}

}
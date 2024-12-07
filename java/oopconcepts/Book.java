package oopconcepts;

public class Book {
	private String title;
	private String author;
	private double price;
	private int numberofcopies;
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public int getNumberofcopies() {
		return numberofcopies;
	}
	 public void  setTitle(String title ) {
		 this.title=title;
	 }
	 public void  setAuthor(String author) {
		 this.author=author;
	 }
	 public void  setPrice(String price) {
		 this.price=price;
	 }
	 public void  setNumberofcopies(String numberofcopies) {
		 this.numberofcopies=numberofcopies;
	 }
	
	 
	
	 public Book() {
		super();
	}
	public Book(String title, String author, double price, int numberofcopies) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.numberofcopies = numberofcopies;
	}
	public String toString()
	 {
		 return( "The title is :"+ title +"\nThe author is :"+ author +"\nthe amount is :" +price + "the number of copies :"+numberofcopies);
	 }
}

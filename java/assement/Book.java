package assement;

public class Book {
	private String title;
	private String author;
	private double price;
	private int numberofcopies;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNumberofcopies() {
		return numberofcopies;
	}
	public void setNumberofcopies(int numberofcopies) {
		this.numberofcopies = numberofcopies;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", numberofcopies=" + numberofcopies
				+ "]";
	}
	public Book(String title, String author, double price, int numberofcopies) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.numberofcopies = numberofcopies;
	}
	public Book() {
		super();
	}
	

}

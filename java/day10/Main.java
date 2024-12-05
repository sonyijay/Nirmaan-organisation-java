package day10;

public class Main {
public static void main(String[] args) {
	Car car1=new Car();
	car1.displaycardetails();
	Car car2=new Car("tata");
	car2.displaycardetails();
	Car car3=new Car("tata",1999);
	car3.displaycardetails();
}
}

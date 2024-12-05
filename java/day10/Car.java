package day10;

public class Car {
	String make;
	int year;
	
	Car(){
		this.make="unknown";
		this.year=2000;}
	
		Car(String make){
		
			this.make=make;
			this.year=2000;
			
				}
		Car(String make,int year){
			
			this.make=make;
			this.year=year;
			
				}
	public void displaycardetails() {
		System.out.println(make);
		System.out.println(year);
	}

	
	

	
	}

 

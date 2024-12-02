package Level1;

import java.util.Scanner;

public class arrayconcept {
	void teenage(int age) {
		if(age <=19) {
			System.err.println("your are a teenage");
		}else {
			System.out.println("your are adult");
			
		}
	}
public static void main(String[] args) {
	arrayconcept age =new arrayconcept();
	Scanner sc =new Scanner(System.in);
	System.out.println("enter your age");
	int userAge =sc.nextInt();
	age.teenage(userAge);
}
	
	
	
	
	

}

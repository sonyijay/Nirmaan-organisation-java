package day16;

public class Bird implements IAnimal{
	@Override
	public void move() {
		System.out.println("the birds flies in the sky");
	}
	@Override
	public void speak() {
		System.out.println("The bird says : chirp chirp ");
	}
	public static void main(String[] args) {
		Bird bird=new Bird();
		bird.move();
		bird.speak();
		System.out.println(IAnimal.isMammal("bird"));
		System.out.println(IAnimal.name);
	}
	
	

}




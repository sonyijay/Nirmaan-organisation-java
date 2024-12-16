package day16;

public class Dog implements IAnimal{
	@Override
	public void move() {
		System.out.println("the dog runs on four legs");
	}
	@Override
	public void speak() {
		System.out.println("The dog says : WOOF Woof! ");
	}
	public static void main(String[] args) {
		Dog dog =new Dog();
		dog.move();
		dog.speak();
		System.out.println(IAnimal.isMammal("dog"));
		System.out.println(IAnimal.name);
	}
	
	

}

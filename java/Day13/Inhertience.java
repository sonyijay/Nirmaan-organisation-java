package Day13;

 class Animal {
	void sound() {
		System.out.println("the animal makes a sound");
	
	}
	

}

class Dog extends Animal{
@Override	
void sound() {

	System.out.println("the dog barks");
}
	
}
class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("the cat meows");
	}
}
public class Inhertience{
public static void main (String args[]) {
	Dog dog = new Dog();
	dog.sound();
	Cat cat = new Cat();
	cat.sound();
}



}


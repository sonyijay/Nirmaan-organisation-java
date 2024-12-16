package day16;

public interface IAnimal {
	String name = "living being";

	static boolean isMammal(String animalName) {
		return (animalName.equalsIgnoreCase("Dog") )||(animalName.equalsIgnoreCase("cat"))||(animalName.equalsIgnoreCase("human"));
	}
	default void speak() {
		System.out.println("animal is making a sound");
	}
	public void move();
}

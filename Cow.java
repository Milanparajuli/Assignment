package milan.java.assignment;

public class Cow {
	static void eat() {
		System.out.println("Work of Cow is Eating Grass");
	}
	static void bark() {
		System.out.println("Work of Cow is Barking");
	}
	static void milk() {
		System.out.println("Work of Cow is Give milk");
	}
	public static void main(String[] args) {
		String name = "Pinky";
		String color = "Red";
		float weight= 100.5f;
		System.out.println("Nmae of cow is " + name);
		System.out.println("color of cow is " + color);
		System.out.println("Weight of cow is " + weight + "kg");
		eat();
		milk();
		bark();
	}
}

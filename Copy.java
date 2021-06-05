package milan.java.assignment;

public class Copy {
	 	void write() {
		System.out.println("Work of copy is writting");
	}
	public static void main(String[] args) {
		String color = "Yellow";
		int weight=20;
		String name= "BISHNU";
		System.out.println("Brand Name of copy is "+ name);
		System.out.println("Color of copy is "+ color);
		System.out.println("Weight of copy is " + weight + "gm");
		Copy c=new Copy();
		c.write();
	}

}

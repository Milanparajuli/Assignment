package milan.java.assignment;

public class Laptop {
	static void watching() {
		System.out.println("Work of Laptop is watching movies news songs");
	}
	static void learning() {
		System.out.println("Work of laptop is learning online news portel learning programming");
	}
	static void programming() {
		System.out.println("Work of laptop is developing program");
	}
	
	public static void main(String[] args) {
		String brandName  ="Acer";
		String color = "Black";
		float weight = 3.5f;
		int size =6;
		System.out.println("Brand name  of Laptop is " + brandName);
		System.out.println("Color  of Laptop is " + color);
		System.out.println("Weight  of Laptop is " + weight + "gm");
		System.out.println("Size  of Laptop is " + size + "inch");
		watching();
		learning();
		programming();
	}

}


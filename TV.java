package milan.java.assignment;

public class TV {
	static void watching() {
		System.out.println("Work of TV is watching movies news songs");
	}
	public static void main(String[] args) {
		String brandName  ="Samsung";
		String color = "black";
		float weight = 9.5f;
		int size =15;
		System.out.println("Brand name  of TV is " + brandName);
		System.out.println("Color  of TV is " + color);
		System.out.println("Weight  of TV is " + weight + "gm");
		System.out.println("Size  of TV is " + size + "inch");
		watching();
	}

}

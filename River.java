package milan.java.assignment;

public class River {
	void give() {
		System.out.println("Given us Water,Electricity");
	}
	public static void main(String[] args) {
		String name="Sunkoshi";
		System.out.println("Name is "+ name);
		River r=new River();
		r.give();
	}

}

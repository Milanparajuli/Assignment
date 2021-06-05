package milan.java.assignment;

public class Persion {
	void work() {
		System.out.println("Work of persion is Eating,Speaking, learnig,make money, descover new fact etc");
		
	}
	public static void main(String[] args) {
		String name="Milan";
		int age =19;
		String gender="male";
		String address="Sindhupalchok";
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Address: "+address);
		Persion w = new Persion();
		w.work();
	}

}

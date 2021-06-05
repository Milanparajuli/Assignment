package milan.java.assignment;

public class Mobile {
	static void calling() {
		System.out.println("Work of mobile is Calling");
	}
	static void playingGame() {
		System.out.println("Work of mobile is Playing Games");
	}
	static void learn() {
		System.out.println("Work of mobile is Learning books new or old facts");
	}
	static void watchVideo() {
		System.out.println("Work of mobile is Watching vidos, movies ");
	}
	public static void main(String[] args) {
		String name="Readmi";
		String version="kernal";
		int weight=150;
		String color="gold";
		System.out.println("Name of mobile Brand is:" + name);
		System.out.println("version of mobile is:" + version);
		System.out.println("weight of mobile is:" + weight + "gm");
		System.out.println("color of mobile  is:" + color);
		calling();
		playingGame();
		learn();
		watchVideo();
		
	}

}

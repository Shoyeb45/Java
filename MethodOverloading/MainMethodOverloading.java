import java.io.OutputStream;

class MainMethodOverloading {
	
	public static OutputStream a = System.out;
	
	public static void main(String...args) {
		a.println("string [] args");
		main();
	}

	public static void main() {
		a.println("no parameter");
	}

}


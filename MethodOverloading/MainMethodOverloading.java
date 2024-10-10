class MainMethodOverloading {
	public static void main(String...args) {
		System.out.println("string [] args");
		main();
	}

	public static void main() {
		System.out.println("no parameter");
	}

}


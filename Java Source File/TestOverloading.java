class TestOverloading {
	public static void main(String[] args) {
		System.out.println("main with String[]");
		main("chandru");
		main();
	}

	public static void main(String args) {
		System.out.println("main with String");
	}

	public static void main() {
		System.out.println("main without args");
	}
}
public class App {
	public static void main(String args[]) {
		System.out.println("App.main");
		doStuff();
	}
	private static void doStuff() {
		System.out.println("App.doStuff");
	}
	private static void featureZ() {
		doStuff();
	}
}

public class App {
	public static void main(String args[]) {
		System.out.println("App.main");
		doStuff("main");
	}
	private static void doStuff(String caller) {
		System.out.println("App.doStuff called by: " + caller);
	}
	
	private void featureY() {
		doStuff("featureY");
	}
}

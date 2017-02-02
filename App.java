public class App {
	public static void main(String args[]) {
		System.out.println("App.main");
		//doStuff();
	}
  
	private static void doStuff(String caller) {
		System.out.println("App.doStuff: " + caller);
	}
	
	private void featureZ() {
		doStuff("featureZ");
	}
}

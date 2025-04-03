package list;

public class Singleton {

	private static Singleton instance;
	
	private Singleton() {
		System.out.println("Constrcutor called");
	}
	
	public static Singleton getInstance() {
		
		if(instance == null) {
			instance= new Singleton();
		}
		return instance;
		
	}
	
	public static void dbConnect() {
		System.out.println("DB Connected");
	}
}

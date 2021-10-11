package Java8Practise;

public interface AndroidInterface {
	
	public void Os();
	
	default void quit() {
		System.out.println("Android app close");
	}
	
}

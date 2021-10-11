package oopspractise;

class Main {

	public Main() {
		System.out.println("Non prametrized cons");
	}
	public Main(int num) {
		System.out.println(" prametrized cons");
	}

}
public class ConstrctorChaining{
	public static void main(String[] args) {
		Main obj=new Main();
	}
}

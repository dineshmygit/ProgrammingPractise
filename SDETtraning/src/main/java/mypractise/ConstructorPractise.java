package mypractise;

public class ConstructorPractise {
	
	ConstructorPractise(){
			System.out.println("A");
		}
	ConstructorPractise(int a){
			System.out.println(a);
		}
	class B extends ConstructorPractise {
		B(){
			System.out.println("B");
		}
		B(int b){
			System.out.println(b);
		}
	}
	public static void main(String[] args) {
		//B obj = ConstructorPractise.new B();
	}
}

package oopspractise;

public class ParentClass {
	static int globalVar=10;
	
	public ParentClass(){
		this("dinesh");
		System.out.println("constructor main");
		System.out.println(globalVar);
	}
	public ParentClass(String name){
		System.out.println(name);	
	}

	{
		System.out.println("default block");
	}

	
	static {
		System.out.println("static block");
		globalVar=20;
	}
	
	 public void display() {
		System.out.println("concreate static method");
	}
}

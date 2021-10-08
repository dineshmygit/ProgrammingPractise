package oopspractise;

 class Encapsulation {

	private String name;
	private int age;

	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
 public class EncapsulationPractise {
	 public static void main(String[] args) {
		 Encapsulation obj=new Encapsulation();
		 obj.setAge(27);
		 obj.setName("Dinesh");
		 System.out.println(obj.getAge());
		 System.out.println(obj.getName());
	}
 }

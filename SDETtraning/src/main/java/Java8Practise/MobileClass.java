package Java8Practise;

public class MobileClass implements AndroidInterface,SamsungInterface,OneplusInterface {

	@Override
	public void Os() {
		System.out.println("Listed mobiles are android");
		
	}
	public static void main(String[] args) {
		new MobileClass().Os();
		
		SamsungInterface.samMetod();
		OneplusInterface.samMetod();
	}
	
}

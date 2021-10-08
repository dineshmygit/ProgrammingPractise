package oopspractise;

import java.util.ArrayList;

abstract class Base{
	 Base()
	    {
	        System.out.println("Base Constructor Called");
	    }
	    abstract void fun();
	}
	class Derived extends Base {
	    Derived()
	    {
	        System.out.println("Derived Constructor Called");
	    }
	    void fun()
	    {
	        System.out.println("Derived fun() called");
	    }
	}
	class DerivedNew extends Base {
		DerivedNew()
	    {
	        System.out.println("Derived Constructor Called");
	    }
	    void fun()
	    {
	        System.out.println("DerivedNew fun() called");
	    }
	}
public class AbstractionJavaSelenium {
	public static void main(String[] args) {
		DerivedNew b=new DerivedNew();
		b.fun();
	}
}

package javaaa;

interface Shape
{
	  int length=10; //final &static variables
	int width = 20;
	
	 void circle(); //abstract method
	 
	default void square()
	{
		System.out.println("This is square- default method...");
	}
	static void rectangle()
	{
		System.out.println("This is rectangle- static method..");
	}	
}

public class Oops_Interface  implements Shape
{
	 public void circle()
	{
	System.out.println("This is circle- abstract method");	
	}
	public static void main(String[] args) 
	{
		//scenario 1 
		Oops_Interface Obj = new Oops_Interface();
		Obj.circle(); //abstract
		Obj.square();	//default
		Shape.rectangle(); //static method can directly access from interface
		//scenario 2 
		Shape s = new Oops_Interface();
		s.circle();
		s.square();
	   Shape.rectangle();
		
	}

}

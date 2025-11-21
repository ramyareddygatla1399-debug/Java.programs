package javaaa;

abstract class ab
{
	abstract void method1();
	abstract void method2();
	abstract void method3();
	 void method4()
	 {
		 System.out.println("method 4");
	 }
}

public class Abstraction extends ab
{
	  void method1()
	{
		System.out.println("method 1");
		
	}
	  void method2()
	{
		System.out.println("method 2");
		
	}
	 	void method3()
	{
		System.out.println("method 3...");
		
	}

	public static void main(String[] args) 
	{
		Abstraction  abs = new Abstraction();
		abs.method1();
		abs.method2();
		abs.method3();
		abs.method4();
		
		

	}

}

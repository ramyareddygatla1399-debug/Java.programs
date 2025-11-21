package javaaa;

 interface I1 
{
	int x =100;
	void m1();
}
 interface I2
{
	int y=200;
	void m2();

}
  class  parent_class
 {
	 int z=300;
	 void m3()
	 {
		 System.out.println(z);
	 }
 }

public class Interface_class extends parent_class implements I1,I2 //hybrid inheritance //hierarchy +multiple
{
	public void m1()
	{
		System.out.println(x);
	}
	public void m2()
	{
		System.out.println(y);
	}

	public static void main(String[] args) 
	{
		Interface_class Obj = new Interface_class();
		Obj.m1();
		Obj.m2();
		Obj.m3();

	}

}

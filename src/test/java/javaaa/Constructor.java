package javaaa;

class Parent
{
	int a=13;
	char c='B';
	String s="RAVALI";
	
	
}

public class Constructor extends Parent
{
	int a=03;
	char c='G';
	String s="Ramya";
	
	 void method(int a,char c,String s)
	{
		 System.out.println(this.a+" instance variables");
		 System.out.println(this.c+" instance variables");
		 System.out.println(this.s+" instance variables");
		 
		 System.out.println(a);
		 System.out.println(c);
		 System.out.println(s);
		 
		System.out.println(super.s+" Super class variables");
		 System.out.println(super.c+" Super class variables");
		 System.out.println(super.s+" Super class variables");
		
	}
	

	public static void main(String[] args)
	{
		Constructor obj = new Constructor();
		obj.method(10,'R',"RAJESH");

	}

}

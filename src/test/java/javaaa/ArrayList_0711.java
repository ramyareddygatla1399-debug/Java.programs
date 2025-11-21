package javaaa;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_0711 
{

	public static void main(String[] args) 
	{
		//ArrayList<Integer> list = new ArrayList<Integer>(); //Homogeneous data
		//Declaration of Array list for heterogeneous data 
		//List li = new ArrayList(); //
		
		ArrayList al = new ArrayList();
		
		al.add(13);
		al.add('G');
		al.add("Ramya");
		al.add(13);
		al.add(null);
		al.add(null);
		al.add(13.03f);
		
		//Size of arrayList
		//System.out.println("Size of an array: "+al.size());
		
		//Printing arrayList
		//System.out.println("Array data: "+al);
		
		//Remove an element
		//System.out.println(al.remove(3));
		//System.out.println("Size of an array After rempving: "+al.size());
		
		//Adding an element
	 	//al.add(3,'A');
		//System.out.println("After adding an element: "+al);
		
		//Modify element in the array
		//al.set(3, "Ram");
		//System.out.println(al);
		
		//Access specific element from an array
	   //System.out.println(al.get(3));
	   
	   //Reading all the data from arrayList
	   
	   //using for loop
	   
	  /* for(int i=0;i<al.size();i++)
	   {
		   System.out.println(al.get(i));
		   
	   }*/
		
		//using for each loop
		
		/*for( Object X :al)
		{
			System.out.println(X);
		}*/
		
		//using Iterator	
	     /*  Iterator<Object> it  = al.iterator();   
	       while(it.hasNext())
	       {
	    	  System.out.println(it.next()); 
	       }*/
		
		//check arraylist is empty or not
		
		//System.out.println("is array list empty?:"+ al.isEmpty());
		
		//remove some data from arraylist
		
		/*List li2= new ArrayList();
		li2.add(13);
		li2.add('G');
		li2.add("Ramya");
		al.removeAll(li2);
		
		System.out.println(al);*/
		
		//remove all the data from the array list 
		
	System.out.println("Before remove: "+al);
	al.clear();
	System.out.println("After remove: "+al);
	}

}

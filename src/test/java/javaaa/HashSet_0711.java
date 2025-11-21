package javaaa;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_0711 
{

	public static void main(String[] args) 
	{
		//Declaration 
		
		//HashSet<String> hss = new HashSet<String>(); //for homogeneous data
		//HashSet hs = new HashSet(); // for heterogenous data 
		Set st = new HashSet();
		
		st.add(100);
		st.add(10.5);
		st.add("Welcome");
		st.add(true);
		st.add('A');
		st.add(100);
		st.add(null);
		st.add(null);
		
		//Printing data in Hashset
		System.out.println("Before removing element: "+st);
		
	//remove element 
		st.remove(10.5);
	System.out.println("After removing: "+st);
	
	//Inserting element - not possible 
	//Access specific element  - not possible 
	
	//Convert hashset to arrayList 
	/*ArrayList a1 = new ArrayList(st);
	System.out.println("Array List: "+a1);
	System.out.println(a1.get(2));*/
	
	//read all the elements using for each 	
	/*for(Object  x:st)
	{
		System.out.println(x);
	}*/
	
	     Iterator<Object> it = st.iterator();
	     
	     while(it.hasNext())
	     {
	    	System.out.println(it.next()); 
	     }
	     
	     //Clearing all the data from hashset
	     //st.clear();
	     
	     System.out.println(st.isEmpty());
	     
	     //size of an hashset 
	     
	     System.out.println(st.size());
	}

}

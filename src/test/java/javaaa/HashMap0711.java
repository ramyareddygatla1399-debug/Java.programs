package javaaa;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;

public class HashMap0711 
{

	public static void main(String[] args) 
	{
		//declaration
		//Map m = new HashMap(); 
		HashMap<Integer,String> hm =  new HashMap<Integer,String>();
		
		//Adding pairs
		hm.put(101, "Ramya");
		hm.put(102, "mip");
		hm.put(103, "tgb");
		hm.put(104, "Rav");
		hm.put(102, "sita");
		hm.put(105, "Ramya");
		
		System.out.println(hm);
		
		//Size of hashmap
		System.out.println("Size of an hashmap: "+hm.size());
		
		//rempve the pair 
		hm.remove(104);
		System.out.println("After removing pair: "+hm);
		
		//Access value of the key 
		System.out.println(hm.get(101));
		
		//Get all the keys from hashmap
		System.out.println(hm.keySet());
		
		//Get all the values from hashmap 	
		System.out.println(hm.values());
		
		//get all keys and values
		System.out.println(hm.entrySet());
		
		//reading all the data from hashmap using for each loop 
		
		for(int k:hm.keySet())
		{
			System.out.println(k+" "+hm.get(k));
		}
		
		//using iterator 
		
		 /*Iterator<Entry<Integer,String>>  it =   hm.entrySet().iterator();
		 
		 while(it.hashNext())
		 {
			Entry<Integer,String>entry = it.next();	
			System.out.println(entry.getKey()+"   "+entry.getValue());
		 }*/
		
		hm.clear();
		
		System.out.println(hm.isEmpty());

	}

}

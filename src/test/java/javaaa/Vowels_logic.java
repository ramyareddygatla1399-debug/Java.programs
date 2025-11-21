package javaaa;

public class Vowels_logic 
{

	public static void main(String[] args) 
	{
		String S ="ramyareddy";// 10chars 
		System.out.println("total number of characters in my name is: "+S.length());
	   char[] str = S.toCharArray();
	   
	  int len =  str.length;
	  System.out.println(len);
	  int count=0;
	  
	  for(int i=0;i<str.length;i++)
	  {
		  if(str[i] =='a' || str[i] =='e' || str[i]=='i' || str[i]=='o' ||str[i]=='u')
		  {
			  count++;
			  System.out.println(str[i]);  
		  }	  
	  }
	  
      System.out.println("vowels count in my name is:"+count);
	}

}

package javaaa;

public class Reverse_number 
{

	public static void main(String[] args) 
	{
		/*input 1234
		 * output 4321
		 */
		
		int num = 1234;
		int rev = 0;
		
		System.out.println("Actual number is: "+num);
		
		while (num != 0) {
            int digit = num % 10;        // get last digit
            rev = rev * 10 + digit; // build reversed number
            num = num / 10;           // remove last digit
        }
		System.out.println("Reversed number is: "+rev);
			

	}

}

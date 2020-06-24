import java.util.Scanner;
import java.lang.String;

public class PalindromeString {

	public static void  main(String[] args)
	{
		String str= "";
		String reverse = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		str = sc.nextLine();
		
		int len = str.length();
		int i;
		 for ( i = len-1 ; i>= 0 ; i--)
			  reverse = reverse + str.charAt(i);
			
		if(str.equals(reverse)) {
			System.out.println(" The entered String is Palindrome");
		}
		else {
		System.out.println( " The entered String is not  Palindrome");	
		}
		sc.close();
	}	
}

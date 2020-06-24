package p1;

import java.util.Scanner;

public class VowelsString {

	public static void  main(String[] args)
	{
		String str= "";
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to find the coount of vowels");
		str = sc.nextLine();
		str= str.toLowerCase();
		int len = str.length();
		int i;
		 for ( i = 0 ; i<len ; i++)
		 {
			char ch = str.charAt(i);
			 if(ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch =='u')
			 {
				 count=count+1;
					  
		 }
			
		 }
		 System.out.println("The count of vowels in the entered string are: "+count);
	}
}
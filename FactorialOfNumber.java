
public class FactorialOfNumber {
	
	public static void main( String[] args)
	{
	System.out.println("Enter any number");
	int n = new java.util.Scanner(System.in).nextInt();
	int f = 1;
	int i = 1;
	
	for(i = 1; i <= n; i++) {
	f = f*i;
	
}
	System.out.println("Factorial of a number is " +f);
	
}
}
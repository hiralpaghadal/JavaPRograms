import java.util.Scanner;

public class MethodOverloading {

	double total;
	double add (double... values)
	{
		for(double value:values) {
			total += value;
		}
	return total;
	}
	
	
	
	public static void main(String[] args) {
		
		MethodOverloading m = new MethodOverloading();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the nos");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double sum = m.add(a,b);
		
		System.out.println(sum);
	}
	
	
}

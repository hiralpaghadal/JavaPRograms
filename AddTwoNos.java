import java.util.Scanner;
public class AddTwoNos {

	int sum;
	
	AddTwoNos(int a, int b){
		sum = a+b;
	}
	
	void display() {
		System.out.println("sum of two numbers is  "+ sum);
	
	}
	
	public static void main(String [] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		AddTwoNos t1= new AddTwoNos(a,b);
		t1.display();
		sc.close();
	}
	
}

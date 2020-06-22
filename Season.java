import java.util.Scanner;
public class Season {
	public static void main( String[] args) {
		
		System.out.println("Enter any number of the month");
		Scanner scan = new Scanner(System.in);
				
		int n = scan.nextInt();
		
		switch(n) {
			case(1):
				System.out.println("the season is winter");
				break;
				
			case(2):
				System.out.println("the season is winter");
				break;
				
			case(3):
				System.out.println("the season is spring");
				break;
				
			case(4):
			System.out.println("the season is spring");
				break;
				
			case(5):
			System.out.println("the season is spring");
				break;
				
			case(6):
			System.out.println("the season is summer");
				break;
				
			case(7):
			System.out.println("the season is summer");
				break;
				
			case(8):
			System.out.println("the season is summer");
				break;
				
			case(9):
			System.out.println("the season is autum");
			break;
			
			case(10):
			System.out.println("the season is autum");
			break;
			
			case(11):
			System.out.println("the season is autum");
			break;
			
			case(12):
			System.out.println("the season is winter");
			break;
			
			default:
			System.out.println("The season not found");
	}
		scan.close();
}
}

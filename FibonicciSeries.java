
public class FibonicciSeries {

	public static void main( String[] args) {
		int no1 = 0;
		int no2 = 1;
		int no3;
		int i;
		int count = 10;
		
		System.out.println("The fibonnaci series is");
		System.out.print(no1+ " "+no2+" ");
		for(i= 1; i <= count; i++) {
			
			no3 = no1+no2;
			
			System.out.print(no3+" ");
			no1=no2;
			no2=no3;
			
		}
	
	}
}

import java.util.Scanner;

public class Factorial {

	private static Scanner sc;

	public static void main(String[] args) {
		
		
		sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		
		int Input=sc.nextInt();
		int fact=1;
		for(int i=1; i<=Input;i++){
			
			fact=fact*i;
			
				
		}
		System.out.println(fact);
		

	}

}

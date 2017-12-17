import java.util.Scanner;

public class Febonaci {

	private static Scanner sc;

	public static void main(String[] args) {
		
		//Fabonaciseries:  1, 2, 3, 5, 8,13, 21,34 etc
		
		int f1; int f2=0;int f3=1;
		sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int input=sc.nextInt();
		
		for(int i=0;i<=input;i++){
			
			f1=f2;
			f2=f3;
			f3=f1+f2;
			
			System.out.print(" "+ f3); 
		}
		
		
		
		

	}

}

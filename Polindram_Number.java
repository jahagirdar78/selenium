import java.util.Scanner;

public class Polindram_Number {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int Reminder;
		int reverse=0;
		int a=num;

		
		while(num>0){
			
			Reminder=num%10;
			reverse=reverse*10+Reminder;
			num=num/10;
			
			
			
		}
		if(reverse==a){
			
			System.out.println("polidram"+reverse);
		}
		else{
			
				System.out.println("Not Polidram"+reverse);
		}
		

	}

}

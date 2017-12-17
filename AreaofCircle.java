import java.util.Scanner;

public class AreaofCircle {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		
		int radius=sc.nextInt();
		
		double A=Math.PI*radius*radius;
		System.out.println(A);
	
		

	}

}

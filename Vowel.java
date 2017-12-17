import java.util.Scanner;

public class Vowel {

	private static Scanner sc;

	public static void main(String[] args) {
		
		
		sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		
		String Input=sc.nextLine();
		char[] chars=Input.toCharArray();
		
		
		int count=0;
		for(char c: chars){
			switch(c){
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			count++;
			break;
			
			}
		}
System.out.println("Number of the Vowels present in the String:"+count);
	}

}

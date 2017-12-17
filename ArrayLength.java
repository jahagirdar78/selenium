import java.util.*;


public class ArrayLength {

	public static void main(String[] args) {

		int [] x={2,3,5,7,66,56};
		
		Arrays.sort(x);
		System.out.println("Length of the Array is :"+x.length);
		for( int m: x){
			
			System.out.print(" "+m);
		}
		
	}

}

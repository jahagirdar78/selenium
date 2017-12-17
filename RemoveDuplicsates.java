import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicsates {

	public static void main(String[] args) {
	
		ArrayList<String> arr= new ArrayList<String>();
		
		arr.add("Arjun");
		arr.add("Kumar");
		arr.add("rama");
		arr.add("Arjun");
		arr.add("Kumar");
		arr.add("rama");
		arr.add("Kumar");
		arr.add("rama");
		
		System.out.println("Before Removing the duplicates:"+arr);
		
		HashSet<String> sh=new HashSet<String>();
		sh.addAll(arr);
		arr.clear();
		arr.addAll(sh);
		
		System.out.println("After Removing the duplicates:"+arr);
		
	}

}

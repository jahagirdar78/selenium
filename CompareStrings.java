
public class CompareStrings {

	public static void main(String[] args) {
		
		String s1="Rama";
		
		String s2="Krishna";
		String s3="KRISHNA";
		
		String s4="RAMA";
		
		System.out.println("using equal ()method: "+s1.equals(s2));// using equal ()method
		System.out.println("Using ignoreCaseMethod:  "+s1.compareToIgnoreCase(s2));//Using ignoreCaseMethod
		System.out.println("(==) to operators: "+s1==s2);					//(==) to operators
		System.out.println("compareTo() method:"+s1.compareTo(s2));	// compareTo() method
		
		
		System.out.println("****************");
		
		System.out.println("using equal ()method: "+s1.equals(s3));// using equal ()method
		System.out.println("Using ignoreCaseMethod:  "+s1.compareToIgnoreCase(s3));//Using ignoreCase
		System.out.println("(==) to operators: "+s1==s3);//(==) to operators
		System.out.println("compareTo() method:"+s1.compareTo(s3)); // compareTo() method
		
		System.out.println("***************");
		
		System.out.println("using equal ()method: "+s1.equals(s4));// using equal ()method
		System.out.println("Using ignoreCaseMethod:  "+s1.compareToIgnoreCase(s4));//Using ignoreCase
		System.out.println("(==) to operators: "+s1==s4);						//(==) to operators
		System.out.println("compareTo() method:"+s1.compareTo(s4));		//compareTo() method
		
	}

}

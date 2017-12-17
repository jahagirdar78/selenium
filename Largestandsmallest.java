

public class Largestandsmallest {

	public static void main(String[] args) {
		
		
		int []x={12, 133, 33, 87666,67, 678,8765};
		
		
		
		  int Largest  = x[0];
		//int Smallest = x[0];
		
		for( int i=1;i<x.length;i++){
			
			if(x[i]>Largest)	
			Largest=x[i];
			
			//else if (x[i]<Smallest)
			
			// Smallest=x[i];
			
				
		}
		System.out.println("Largest of the Number is: "+Largest);
	//	System.out.println("Smallest of the Number is: "+Smallest);
		

	}

}

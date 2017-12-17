

public class Evenoddnumber {

	public static void main(String[] args) {
		
		int [] x={1, 2, 3, 4, 5, 6, 7, 8, 9,10};
		
		System.out.println(x.length);
		
		for(int i=0; i<x.length;i++)
		{
			if(x[i]%2==0)
			{
				System.out.println("Number is even Number:"+x[i]);
			}else{
				System.out.println("Number is odd Number:"+x[i]);
			}
		}
		
	}

}

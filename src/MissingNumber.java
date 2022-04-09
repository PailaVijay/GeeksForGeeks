
public class MissingNumber {
	
	
	public static int missingNumber(int a[], int n) 
	{
		
	    int  total;
		total=  (n+1)*(n+2)/2;
		for (int i=0; i<n;i++)
		{
			total -= a[i];
		}
		return total;
		
		
		
		
		
	}

	public static void main(String[] args) {
		
		int[] a = {1,2,6, 5,3,7};
		
		
		int miss=missingNumber(a,6);
		
		

	}

}

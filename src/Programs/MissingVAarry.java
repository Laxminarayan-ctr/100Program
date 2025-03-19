package Programs;

public class MissingVAarry {

	public static void main(String[] arg) {
		
		int i[] = {1,2,3,5};
		
		int sum = 0;
		int sum1 = 0;
		
		for(int l = 0; l<i.length;l++ )
		{
			sum = sum+i[l];
		}
		System.out.println(sum);
	
	    for(int k=1; k<=i.length+1;k++)
	    {
	    	sum1 = sum1+k;
	    }
	
	    System.out.println(sum1);
	}
	
	
	
	
	
}

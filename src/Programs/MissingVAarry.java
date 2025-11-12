package Programs;

public class MissingVAarry{
	
	public static void main(String[] args)
	{
		int num[] = {1,2,3,4,6};
		
		int sum= 0;
		int sum1 = 0;
		
		
		for(int i=0; i<num.length; i++)
		{
			sum = sum+num[i];
		}
		
		for(int k=0; k<=num.length;k++)
		{
			sum1 = sum+k;
		}
		
		int miss = sum1-sum;
		
		System.out.println(miss);
		
		
		
		
	}
	
	
	
}

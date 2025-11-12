package Programs;

public class MissingVAarry {

	public static void main(String[] args) {
		int num[] = {1,2,3,4,5,7};

		int sum = 0;
		int sum1 = 0;
		
		for(int i= 0; i<num.length;i++)
		{
			sum= sum+num[i];
		}
		
		for(int k=0; k<=num.length+1;k++)
		{
			sum1 = sum1+k;
		}
		
		int diff = sum1-sum;
		System.out.println(diff);
	}

}

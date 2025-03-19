package Programs;

public class RemoveJunk {
	
	public static void main(String[] args)
	{
		String i = "@#lalJK";
		
		i= i.replaceAll("[^a-zA-Z1-9]", "");
		System.out.println(i);
		
		
	}

}

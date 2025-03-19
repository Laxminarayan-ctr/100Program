package Programs;

public class ReverseString {

	public static void main(String[] args) {

		String name = "Laxminarayan";
		String rev1 = "";

		for (int i = name.length()-1; i >= 0; i--) {
			rev1 = rev1 + name.charAt(i);
			
		}
		System.out.println(rev1);
	}

}
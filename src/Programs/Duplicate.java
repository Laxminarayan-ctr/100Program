package Programs;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name[] = { "java", "selenium", "Kumar", "java", "selenium" };
		{
			for (int i = 0; i < name.length; i++) {
				for (int k = i + 1; k < name.length; k++) {
					if (name[i].equals(name[k])) {
						System.out.println(name[i]);
					}

				}
			}
		}

	}

}

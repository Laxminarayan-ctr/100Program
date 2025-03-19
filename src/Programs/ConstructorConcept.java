package Programs;

public class ConstructorConcept {

	public ConstructorConcept() {

		System.out.println("Default Constructor ");
	}

	public ConstructorConcept(int a) {
		System.out.println("Single perameter Constructor" +a);
	}

	public ConstructorConcept(int a, int b) {

		System.out.println("multiple perameter constructor" +a +" "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorConcept obj = new ConstructorConcept(10,20);
				

	}

}

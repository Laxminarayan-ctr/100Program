package Programs;

public class ConstructorWithThis {

	String name;
	int age;

	public ConstructorWithThis(String name, int age)

	{
		this.name = name;
		this.age = age;
		System.out.println(name);
		System.out.println(age);
	}

	public void Hello() {
		System.out.println(name);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorWithThis obj = new ConstructorWithThis("laxmi", 10);
		obj.Hello();

	}

}

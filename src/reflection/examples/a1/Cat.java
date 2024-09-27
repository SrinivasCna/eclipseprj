package reflection.examples.a1;

public class Cat {

	private final String name;
	private int age;

	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void meow(int number) {
		System.out.println("cat is doing meow " + number + "times");
	}

	private void heyThisIsPrivateMethod() {
		System.out.println("How did you call this ??");
	}

	public static void thisIsPublicStaticMethod() {
		System.out.println("I'm public and static ");
	}

	private static void thisIsPrivateStaticMethod() {
		System.out.println("I'm private and static");
	}

}

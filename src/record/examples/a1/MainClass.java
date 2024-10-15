package record.examples.a1;

public class MainClass {

	public static void main(String[] args) {

		PersonClass person1 = new PersonClass("Kurt Russel", 50);
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
		System.out.println(person1);

		PersonRecord person2 = new PersonRecord("Jim Carrey", 55);
		System.out.println(person2.name());
		System.out.println(person2.age());
		System.out.println(person2);
	}
}

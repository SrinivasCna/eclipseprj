package reflection.examples.a1;

import java.lang.reflect.Field;

public class ReflectionFieldExample {

	public static void main(String[] args) throws Exception {
		Cat cat = new Cat("mia", 6);
		// cat.name="Mia Maria"; // private and access not allowed
		// System.out.println(cat.name);// private and access not allowed
		// System.out.println(cat.age);// private and access not allowed

		// getClass()
		// this method call is our window into a ton of reflection capabilities in java
		Field[] catFields = cat.getClass().getDeclaredFields();
		for (Field field : catFields) {
			System.out.println(field.getName());
		}

		//
		for (Field field : catFields) {
			if (field.getName().equals("name")) {

				// to make the private final field accessible
				field.setAccessible(true);
				field.set(cat, "mia Maria");
			}

		}
		System.out.println(cat.getName());

	}

}

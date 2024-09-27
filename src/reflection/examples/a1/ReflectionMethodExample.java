package reflection.examples.a1;

import java.lang.reflect.Method;

public class ReflectionMethodExample {

	public static void main(String[] args) throws Exception {
		Cat cat = new Cat("Puppy", 9);
		// System.out.println(cat.getName());
		Method[] catMethods = cat.getClass().getDeclaredMethods();
		for (Method method : catMethods) {
			System.out.println(method.getName());
		}

		// for instance method with parameters
		for (Method method : catMethods) {
			if (method.getName().equals("meow")) {
				method.invoke(cat, 5);
				cat.meow(5);
			}
		}

		// for private instance methods no parameters
		for (Method method : catMethods) {
			if (method.getName().equals("heyThisIsPrivateMethod")) {
				method.setAccessible(true);
				method.invoke(cat);

			}
		}

		// for public static methods no parameters
		for (Method method : catMethods) {
			if (method.getName().equals("thisIsPublicStaticMethod")) {
				method.setAccessible(true);
				method.invoke(null); // code using reflection
				Cat.thisIsPublicStaticMethod();// normal code
			}
		}

		// for private static methods no parameters
		for (Method method : catMethods) {
			if (method.getName().equals("thisIsPrivateStaticMethod")) {
				method.setAccessible(true);
				method.invoke(null); // code using reflection

			}
		}

	}

}

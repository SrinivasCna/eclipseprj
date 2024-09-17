package oops.wrapperClasses;

public class WrapperClassesDemo {

	public static void main(String[] args) {
		String text = new String("java");
		text.toUpperCase();

		// int number = new int(10);
		Integer number = new Integer(10); // this is deprecated // not recommended
		Integer number2 = 10;

		String stringNumber = "10";
		Integer age = Integer.parseInt(stringNumber);
		System.out.println(age); // 10

		Byte byteNumber = 127;
		System.out.println(byteNumber);

		Short shortNumber = 32767;
		System.out.println(shortNumber);

		Boolean flag = new Boolean(true); // this is depcrecated // not recommended
		System.out.println(flag);
	}

}

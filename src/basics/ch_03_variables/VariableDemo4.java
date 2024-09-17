package basics.ch_03_variables;

public class VariableDemo4 {

	public static void main(String[] args) {
		int a, b, c;
		a = 1;
		b = 2;
		c = 3;
		int d = 1, e = 2, f = 3;
		int g = a;
		int h, i = 10;
		h = 11;
		System.out.println(a + b + c + d + e + f + g + h + i);

		String subject = "java";
		System.out.println(subject);

		// String course = new String("java");
		// System.out.println(course);
		
		//but can't use String subject more than once like example
		//  String subject ="java" 
		subject = new String("python");

		System.out.println(subject);

	}

}

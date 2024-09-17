package oops.exception.trycatch.examples.a1;

public class TryCatchExample2 {

	public static void main(String[] args) {
		String name = null;

		try {
			if (name.equals("xyz")) {

				System.out.println("name is equal to xyz");
			} else {
				System.out.println("name is not equal to xyz");
			}
		} catch (Exception e) {
			// System.err.println(e);
			e.printStackTrace();
		}

	}

}

package oops.polymorphism.examples.a1;

public class MainClass {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.name = "Kaushik K R";

		Manager mgr = new Manager();
		mgr.name = "Adithya Rao";

		Clerk ck = new Clerk();
		ck.name = "Amar Gowda";

		printEmployee(emp);
		printEmployee(ck);
		printEmployee(mgr);

		printManager(mgr);
		// printManager(ck);
		// printManager(emp);

		printClerk(ck);
		// printClerk(mgr);
		// printClerk(emp);
	}

	public static void printEmployee(Employee emp) {
		System.out.println(emp.name);
	}

	public static void printManager(Manager mgr) {
		System.out.println(mgr.name);
	}

	public static void printClerk(Clerk ck) {
		System.out.println(ck.name);
	}

}

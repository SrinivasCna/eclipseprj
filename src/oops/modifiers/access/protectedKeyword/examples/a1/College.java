package oops.modifiers.access.protectedKeyword.examples.a1;

public class College {
	protected String name;
	protected String city;
	
	public void printCity() {
		System.out.println(city);
	}

	public static void main(String[] args) {
		College dsu = new College();
		dsu.name = "Dayananda Sagar University";
		dsu.city = "electronic city";
		System.out.println(dsu.name);
		System.out.println(dsu.city);

	}

}

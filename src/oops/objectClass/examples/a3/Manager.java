package oops.objectClass.examples.a3;

public class Manager {

	public String name;
	public String city;
	public int age;

	@Override
	public String toString() {
		return this.name + " : " + this.city;
	}

}

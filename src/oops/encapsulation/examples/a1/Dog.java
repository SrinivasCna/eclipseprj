package oops.encapsulation.examples.a1;

public class Dog {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getName() {
		//return name; // this is not a best practice
		return this.name; 
	}
	public int getAge() {
		return this.age;
	}
}

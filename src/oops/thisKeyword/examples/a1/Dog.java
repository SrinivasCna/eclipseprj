package oops.thisKeyword.examples.a1;

public class Dog {
	private String name;
	private int age;
	
	public String getName() {
		return name; // return this.name
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void bark() {
		System.out.println("Bark");
	}
	
}

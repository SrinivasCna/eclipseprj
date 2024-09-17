package oops.encapsulation.examples.a2;

public class Customer {
	private String name;
	private String city;
	private int age;
	private long mobile;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getCity() {
		return this.city;
	}

	public long getMobile() {
		return this.mobile;
	}

}

package oops.classAndObjects.demo1;

public class Main {

	public static void main(String[] args) {

		// Datatype variableName( or reference viable) =new Datatype();
		// Class object= new Class();
		// object.fields();
		// object.methods();
		Student raj = new Student();
		System.out.println(raj);
		System.out.println(raj.age); // 0
		System.out.println(raj.name); // null
		
		raj.name = "Rajkumar";
		raj.age = 21;
		System.out.println(raj.age);
		System.out.println(raj.name);
		
	}

}

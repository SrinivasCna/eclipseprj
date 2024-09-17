package oops.interfaceConcept.single.examples.a1;

public class MainClass {
	public static void main(String[] args) {
		Course course;
		// course=new Course();
		course = new Java();
		course.subject();

		course = new Python();
		course.subject();

	}
}

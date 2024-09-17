package oops.methods.overloading;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
	

	}
	
	public static void getData(String text) {
		System.out.println(text);
	} 
	
	public static void getData(int number) {
		System.out.println(number);
	}
	
	public static void getData(String text, int number) {
		System.out.println(text + number);
	}
	
	public static void getData(int number, String text) {
		System.out.println(number + text);
	}

}

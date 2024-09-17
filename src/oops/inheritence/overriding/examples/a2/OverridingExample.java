package oops.inheritence.overriding.examples.a2;

public class OverridingExample {

	/*
	 * create a class called Restaurant{} 
	 * create a method called makeDish() in Restaurant class 
	 * create a class called BiryaniChef{} 
	 * create a class called PalakPaneerChef{} 
	 * override method makeDish from Restaurant class 
	 * in classes namely BiryaniChef & PalakPaneerChef 
	 * show the implementation in main method with 2 objects
	 */
	public static void main(String[] args) {
		Restaurant res; // we can use res because of it it referred from parent class
		
		res=new Restaurant();
		res.makeDish();
		
		res = new BiriyaniChef(); 
		res.makeDish();
		
		// Biriyani biri = new Biriyani();
		// can't use biri instead of res  because biri is child referred variable

		res = new PalakPaneerChef();
		res.makeDish();
		
		

	}

}

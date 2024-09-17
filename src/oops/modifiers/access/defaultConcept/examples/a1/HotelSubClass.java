package oops.modifiers.access.defaultConcept.examples.a1;

public class HotelSubClass extends Hotel {
	public void printHotel() {
		System.out.println(name + " :" + rooms);

	}

	public static void main(String[] args) {
		Hotel taj = new Hotel();
		taj.name = "HOTEL TAJ ";
		taj.rooms = 200;
		System.out.println(taj.name);
		System.out.println(taj.rooms);

		HotelSubClass ashoka = new HotelSubClass();
		ashoka.name = "Hotel Ashoka International";
		ashoka.rooms = 200;
		ashoka.printHotel();

	}

}

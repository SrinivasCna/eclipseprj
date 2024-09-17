package oops.dateTime.examples.a1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {
	public static void main(String[] args) {
		// LocalDate.now()
		// returns current date from the system clock
		// in the default time-zone.
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);

		// getDayOfWeek()
		// returns the enum DayOfWeek for the day-of-week
		DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
		System.out.println(dayOfWeek);

		// getDayOfMonth()
		// returns the primitive int value for the day-of-month
		int dayOfMonth = currentDate.getDayOfMonth();
		System.out.println(dayOfMonth);

		// getDayOfYear()
		// returns the primitive int value for the day-of-year
		int dayOfYear = currentDate.getDayOfYear();
		System.out.println(dayOfYear);

		// getMonth()
		// returns the Month-of-year field using month enum
		Month month = currentDate.getMonth();
		System.out.println(month);

		// getYear()
		// returns the primitive value for the year
		int year = currentDate.getYear();
		System.out.println(year);

		// getMonthValue()
		// returns the month as an int value from 1 to 12
		int monthValue = currentDate.getMonthValue();
		System.out.println(monthValue);

		// LocalDate.Of(year,month,day) // using this trick if i want to use our own date
		// returns a LocalDate with the specified year, month and day-of-month
		LocalDate independenceDate = LocalDate.of(1947, 8, 15);
		System.out.println(independenceDate);
		
		//
		LocalDate indDate = LocalDate.of(1947, Month.AUGUST, 15); // using enum in month name
		System.out.println(indDate);
	}

}

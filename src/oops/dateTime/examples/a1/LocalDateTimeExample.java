package oops.dateTime.examples.a1;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeExample {
	public static void main(String[] args) {
		// LocalDateTime.now()
		// returns LocalDateTimeobject
		// returns current date-time from the system clock in the default time zone
		LocalDateTime timeStamp = LocalDateTime.now();
		System.out.println(timeStamp);

		// getDayOfWeek()
		// returns the day-of-week field, which is an enum DayOfWeek
		DayOfWeek dayOfWeek = timeStamp.getDayOfWeek();
		System.out.println(dayOfWeek);

		// getDayOfMonth()
		// returns the primitive int value for the day-of-month
		int dayOfMonth = timeStamp.getDayOfMonth();
		System.out.println(dayOfMonth);

		// getDayOfYear()
		// returns the primitive int value value for the day-of-year
		int dayOfYear = timeStamp.getDayOfYear();
		System.out.println(dayOfYear);

		// getHour()
		// returns the Hour-Of-day from 0 to 23
		int hour = timeStamp.getHour();
		System.out.println(hour);

		// getMinute()
		// returns the Minute-Of-Hour from 0 to 59
		int minute = timeStamp.getMinute();
		System.out.println(minute);

		// getMinute()
		// returns the Second-Of-Minute, from 0 to 59
		int second = timeStamp.getSecond();
		System.out.println(second);

		// getNano()
		// returns the nano-of-second, from 0 to 999,999,999
		int nano = timeStamp.getNano();
		System.out.println(nano);

		// getYear()
		// returns thePrimitive int value for the year
		int year = timeStamp.getYear();
		System.out.println(year);

		// getMonth()
		// returns the month-of-the year in an enum month
		Month month = timeStamp.getMonth();
		System.out.println(month);

	}
}

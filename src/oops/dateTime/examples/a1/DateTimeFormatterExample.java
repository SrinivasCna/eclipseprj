package oops.dateTime.examples.a1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {

	public static void main(String[] args) {
		LocalDateTime timeStamp = LocalDateTime.now();
		System.out.println(timeStamp);

		DateTimeFormatter formatter;

		// DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
		// returns a formatter using the specified pattern
		formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		// format()
		// formats this date-time using specified formatter.
		// returns the formatted date-time string
		String ts;
		ts = timeStamp.format(formatter);
		System.out.println(ts);

		// E return day of the week // e.g, wed
		formatter = DateTimeFormatter.ofPattern("E dd-MM-yyyy");
		ts = timeStamp.format(formatter);
		System.out.println(ts);

		// MMM returns month name //e.g, Sep
		formatter = DateTimeFormatter.ofPattern("E dd-MMM-yyyy");
		ts = timeStamp.format(formatter);
		System.out.println(ts);

		// B returns time of the day // e.g, in the morning
		formatter = DateTimeFormatter.ofPattern("B dd-MMM-yyyy");
		ts = timeStamp.format(formatter);
		System.out.println(ts);

	}

}

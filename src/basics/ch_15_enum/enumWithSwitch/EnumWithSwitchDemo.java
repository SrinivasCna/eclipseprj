package basics.ch_15_enum.enumWithSwitch;

public class EnumWithSwitchDemo {

	public static void main(String[] args) {
		MonthEnum monthName;

		monthName = MonthEnum.DECEMBER;

		switch (monthName) {
		case JANUARY:
			System.out.println(monthName + ": 31");
			break;
		case FEBRUARY:
			System.out.println(monthName + ": 28");
			break;
		case MARCH:
			System.out.println(monthName + ": 31");
			break;
		case APRIL:
			System.out.println(monthName + ": 30");
			break;
		case MAY:
			System.out.println(monthName + ": 31");
			break;
		case JUNE:
			System.out.println(monthName + ": 30");
			break;
		case JULY:
			System.out.println(monthName + ": 31");
			break;
		case AUGUST:
			System.out.println(monthName + ": 31");
			break;
		case SEPTEMBER:
			System.out.println(monthName + ": 30");
			break;
		case OCTOBER:
			System.out.println(monthName + ": 31");
			break;
		case NOVEMBER:
			System.out.println(monthName + ": 30");
			break;
		case DECEMBER:
			System.out.println(monthName + ": 31");
			break;

		}
	}
}

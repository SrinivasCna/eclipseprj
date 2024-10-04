package basics.ch_15_enum;

public class Main {

	public static void main(String[] args) {
		GenderEnum gender = GenderEnum.MALE;
		System.out.println(gender);

		WeekEnum dayName;
		dayName = WeekEnum.THURSDAY;
		System.out.println(dayName);
		dayName = WeekEnum.FRIDAY;
		System.out.println(dayName);

	}

}

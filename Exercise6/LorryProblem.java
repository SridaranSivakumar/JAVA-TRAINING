package Exercise6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Scanner;

public class LorryProblem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Speed");
		int speed = scanner.nextInt();
		System.out.println("Enter the distance");
		int totalDistance = scanner.nextInt();
		int distanceInOneDay = calDistance(speed);
		timeTOCover(totalDistance, distanceInOneDay, speed);
	}

	private static void timeTOCover(int totalDistance, int distanceInOneDay, int speed) {
		// TODO Auto-generated method stub
		DayOfWeek week;
		int coveredDistance = 0;
		int month, time, year, day, hours, weekOfMonth1, minute;
		int storeday, storehour;
		LocalTime StartTime;
		LocalDate startDate;
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		hours = currentTime.getHour();
		minute = currentTime.getMinute();
		year = currentDate.getYear();
		week = currentDate.getDayOfWeek();
		month = currentDate.getMonthValue();
		day = currentDate.getDayOfMonth();
		LocalDate date = LocalDate.of(year, month, day);
		weekOfMonth1 = date.get(ChronoField.ALIGNED_WEEK_OF_MONTH);
		//StartTime = currentTime;
		startDate = currentDate;

		int countDays = 0;
		boolean val = true;
		int remainingHour;
		while (val) {
			if (hours < 24) {
				if (week.equals("SUNDAY") || weekOfMonth1 == 2 || (month == 1 && day == 1) || (month == 1 && day == 26)
						|| (month == 8 && day == 15)) {
					System.out.println("Holiday");
					countDays++;
					startDate = currentDate.plusDays(countDays);
				} else {
					if (coveredDistance < totalDistance && hours <= 4) {
						coveredDistance += distanceInOneDay;
						countDays++;
						
						startDate = currentDate.plusDays(countDays);
					} else if (coveredDistance < totalDistance && hours > 4) {
						int getHour = currentTime.getHour();
						remainingHour = 24 - getHour;
						int distance = remainingHour * speed;
						coveredDistance += distance;
						countDays++;
						startDate = currentDate.plusDays(countDays);
					} else {
						System.out.println("Destination Reached Date : "+startDate);
						val = false;

					}
				}
			}
		}
	}

	public static int calDistance(int speed) {
		return speed * 8;
	}

}

package TaskDay5;

//Using thread to print digital clock 
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DigitalClock_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		HourMinSec hourMinSec = new HourMinSec();
		executorService.execute(() -> {
			hourMinSec.calculateSec();
		});
		executorService.execute(() -> {
			hourMinSec.calculateMin();
		});
		executorService.shutdown();
	}
}
class HourMinSec {
	static int hour= 12, minute = 0, second = 0;
	void calculateSec() {
		try {
			while (true) {
				if (second == 60) {
					second = 0;
				} else {
					Thread.sleep(1000);
					System.out.println(hour+ ":" + minute + ":" + second);
					second = second + 1;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		notify();
	}
	void calculateMin() {
		try {
			while (true) {
				if (minute == 60) {
					calculateHour();
				} else {
					Thread.sleep(60000);
					minute = minute + 1;		
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static void calculateHour() {
		if (hour == 12) {
			hour = 1;
			minute = 0;
		} else {
			hour += 1;
			minute = 0;
		}
	}

}
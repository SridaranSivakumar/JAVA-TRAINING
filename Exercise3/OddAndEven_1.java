package TaskDay5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* Two threads one to display even and another to diaplay  odd from 0 to 100 */
public class OddAndEven_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(2);
		IterateNumbers iterater = new IterateNumbers();
		es.execute(() -> {
			iterater.printOdd();
		});
		es.execute(() -> {
			iterater.printEven();
		});
		es.shutdown();
	}

}

class IterateNumbers {
	// synchronized
	void printOdd() {
		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}

	// synchronized
	void printEven() {
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
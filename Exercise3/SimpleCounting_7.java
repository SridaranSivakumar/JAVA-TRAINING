package TaskDay5;

//To print a string in the multiple of 10
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleCounting_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		CountNumber count = new CountNumber();
		executorService.execute(() -> {
			count.countThread();
		});

	}

}
class CountNumber{
	synchronized void countThread() {
		try {
			for (int i = 1; i <= 100; i++) {
				if (i % 10 == 0) {
					System.out.println("This is the tenth number");
				} else {
					Thread.sleep(1000);
					System.out.print(i + " ");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

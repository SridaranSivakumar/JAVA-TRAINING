package TaskDay5;

//Inventory System to accexecutorServices product from producer
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InventorySystem_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		Inventory in = new Inventory();
		executorService.execute(() -> {
			for (int i = 0; i < 5; i++) {
				in.producer();
			}
		});
		executorService.execute(() -> {
			for (int i = 0; i < 5; i++) {
				in.consumer();
			}
		});
		executorService.shutdown();
	}
}

class Inventory {
	boolean flag = false;

	synchronized public void producer() {
		if (flag) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		System.out.println("producer produces");
		flag = true;
		notify();
	}

	synchronized public void consumer() {
		if (!flag) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		System.out.println("consumer consumes");
		flag = false;
		notify();
	}
}

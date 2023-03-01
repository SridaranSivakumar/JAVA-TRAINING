package TaskDay5;

//To print the message in  order using synchronization
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedAccess_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		MultipleMethods methods = new MultipleMethods();
		executorService.execute(() -> {
			methods.printString("Message1");
		});
		executorService.execute(() -> {
			methods.printString("Message2");
		});
		executorService.execute(() -> {
			methods.printString("message3");
		});
		executorService.shutdown();
	}

}

class MultipleMethods {
	synchronized void printString(String s) {
		System.out.println("[-------" + s + "--------]");
	}

}

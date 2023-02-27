package TaskDay5;

//To print the message in  order using synchronization
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedAccess_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(3);
		MultipleMethods methods = new MultipleMethods();
		es.execute(() -> {
			methods.methodrun("Message1");
		});
		es.execute(() -> {
			methods.methodrun("Message2");
		});
		es.execute(() -> {
			methods.methodrun("message3");
		});
		es.shutdown();
	}

}

class MultipleMethods {
	synchronized void methodrun(String s) {
		System.out.println("[-------" + s + "--------]");
	}

}

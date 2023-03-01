package TaskDay5;

//To print letter using String buffer
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StringBufferThread_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(3);
		StringBuffer str = new StringBuffer("A");
		IterateThread iterator = new IterateThread(str);
		es.execute(() -> {
			iterator.run();
		});
		es.execute(() -> {
			iterator.run();
		});
		es.execute(() -> {
			iterator.run();
		});
		es.shutdown();
	}
}
class IterateThread extends Thread {
	StringBuffer str;
	public IterateThread(StringBuffer str) {
		// TODO Auto-generated constructor stub
		this.str = str;
	}
	@Override
	public void run() {
		synchronized (str) {
			for (int i = 0; i < 100; i++) {
				System.out.print(str + " ");
			}
			System.out.println();
			char val= str.charAt(0);
			val++;
			String changedstring = Character.toString(val);
			str.replace(0, 1, changedstring);
		}
	}
}
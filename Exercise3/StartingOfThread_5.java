package TaskDay5;

//To start two thread simultaneously
public class StartingOfThread_5 {

	public static void main(String[] args) {

		ImplementThread i = new ImplementThread();
		// TODO Auto-generated method stub
		Thread t = new Thread(i, "thread1");
		t.start();
		t.start();
//        t.run();
	}
}

class ImplementThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is Running");
	}

}
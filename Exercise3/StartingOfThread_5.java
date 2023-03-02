package TaskDay5;

//To start two thread simultaneously
public class StartingOfThread_5 {
	public static void main(String[] args) {
		
		Thread thread = new Thread();
		thread.start();
		thread.start();
	}
}
class ImplementThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is Running");
	}

}
package TaskDay5;
//To start two thread simultaneously
public class StartingOfThread_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Thread t=new Thread();
        t.start();
        t.start();

}
}

class ImplementThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is Running");
	}
	
}
package TaskDay5;
//To print the message in  order using synchronization
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedAccess_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es=Executors.newFixedThreadPool(3);
		MultipleMethods methods=new MultipleMethods();
		es.execute(()->{
			methods.method1();
		});
		es.execute(()->{
			methods.method2();
		});
		es.execute(()->{
			methods.method3();
		});
		es.shutdown();
	}

}
class MultipleMethods{
	synchronized void method1() {
		System.out.print("\"[-------");
	}
	synchronized void method2() {
		System.out.print("Message");
	}
	synchronized void method3() {
		System.out.print("----------]\"");
	}
}

package TaskDay5;
//Using thread to print digital clock 
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DigitalClock_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      ExecutorService es=Executors.newFixedThreadPool(3);
      HourMinSec hms=new HourMinSec();
		es.execute(()->{
			
			hms.second();
			
			});
		es.execute(()->{
			
			hms.minutes();
			
			});
    es.shutdown();
	}
}
class HourMinSec{
   static int hours=12,minute=0,second=0;
	  void second() {
		try {	
			while(true) {
	
			if(second==60) {
				second=0;
				
			}else {
				Thread.sleep(1000);
				
				System.out.println(hours+":"+minute+":"+second);
				second=second+1;
				
			}
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		notify();
		
	}
	 void minutes() {
		try {
		  while(true){
			if(minute==60 ) {
				hours();
			}else {
				Thread.sleep(60000);
				minute=minute+1;
				
				//System.out.println(hours+":"+minute+":"+second);
				
			
			}
		  }
		}catch (Exception e) {
			// TODO: handle exception
			
		}
				
		
		  
	}
	 static void hours() {
		 
		 
		if(hours==12) {
			hours=1;
			minute=0 ;
		 }else {
			 hours+=1;
			 minute=0;
		 }
	 }
	
	
	
}
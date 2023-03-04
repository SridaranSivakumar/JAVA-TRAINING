package Exercise7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;

public class DateObject_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	FileOutputStream fos = new FileOutputStream("/Users/sridaransivakumar/Desktop/Demo/Date.txt");
        	ObjectOutputStream outputWriter=new ObjectOutputStream((fos));
        	LocalDateTime date=LocalDateTime.now();
        	outputWriter.writeObject(date);
        }catch (Exception e) {
			// TODO: handle exception
        	e.printStackTrace();
		}
        try {
        	FileInputStream fis = new FileInputStream("/Users/sridaransivakumar/Desktop/Demo/Date.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            LocalDateTime date = (LocalDateTime) ois.readObject();
            System.out.println(date);
        }catch (Exception e) {
			// TODO: handle exception
        	e.printStackTrace();
		}
        
	}

}

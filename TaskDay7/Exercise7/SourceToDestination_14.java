package Exercise7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SourceToDestination_14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			File source =new File("/Users/sridaransivakumar/Desktop/Demo/Source.txt");
				File destination =new File("/Users/sridaransivakumar/Desktop/Demo/Destination.txt");
			 FileInputStream inputStream = new FileInputStream(source);
		      
		      FileOutputStream outputStream = new FileOutputStream(destination);
		      int length = (int) source.length();
		      byte[] buffer = new byte[length];
		      while ((length = inputStream.read(buffer)) > 0) {
		         outputStream.write(buffer, 0, length);
		      }
		      inputStream.close();
		      outputStream.close();
		      System.out.println("File copied");
		   }
	}

 
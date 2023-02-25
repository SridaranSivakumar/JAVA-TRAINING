package TaskDay4;

import java.io.FileInputStream;
import java.io.IOException;

public class IoException_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  FileInputStream file=new FileInputStream("program.txt");
      }catch(IOException e) {
    	  
    	  e.printStackTrace();
      }
	}

}
//interface
//push pop
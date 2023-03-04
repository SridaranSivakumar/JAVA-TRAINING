package Exercise7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFIleLineyLine_15 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader inputStream = null;
	
	try {
        inputStream=new BufferedReader(new FileReader("/Users/sridaransivakumar/Desktop/Demo/sourceLine.txt"));
      
       String line;
       while((line=inputStream.readLine())!=null) {
    	  System.out.println(line);
  
       }}catch (Exception e) {
		// TODO: handle exception
    	   e.printStackTrace();
	}
	}

}

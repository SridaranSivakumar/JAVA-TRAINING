package Exercise7;

import java.io.BufferedReader;
import java.io.FileReader;

public class ContentOfFile_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try{
				BufferedReader reader=new BufferedReader(new FileReader("/Users/sridaransivakumar/Desktop/Demo/Size.txt"));
				String line;
				while((line=reader.readLine())!=null) {
					System.out.println(line);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
	} 
	}



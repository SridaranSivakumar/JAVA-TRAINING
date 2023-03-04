package Exercise7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CountWords_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   File file = new File("/Users/sridaransivakumar/Desktop/Demo/sample.txt");
		   try {
			   Scanner sc=new Scanner(new FileInputStream(file));
			   int count=0;
			   while(sc.hasNext()) {
				   sc.next();
				   count++;
			   }
			   System.out.println("Number of words : "+count);
		   }catch (Exception e) {
			// TODO: handle exception
			   e.printStackTrace();
		}
      }
	}



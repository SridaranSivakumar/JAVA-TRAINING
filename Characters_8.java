package Exercise7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Characters_8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int count=0;
		while(true) {
			char input=scanner.next().charAt(0);
			count+=1;
			System.out.println(count);
		}
	}
}

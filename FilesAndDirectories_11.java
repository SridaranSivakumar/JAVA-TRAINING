package Exercise7;

import java.io.File;

public class FilesAndDirectories_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      File directoryPath = new File("/Users/sridaransivakumar/Desktop/Demo/");
		      String filesDirectories[] = directoryPath.list();
		      System.out.println("Files And Directories : ");
		      System.out.println();
		      for(int i=0; i<filesDirectories.length; i++) {
		         System.out.println(filesDirectories[i]);
		      }
	}

}

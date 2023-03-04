package Exercise7;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RenameFile_10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Path file = Paths.get("/Users/sridaransivakumar/Desktop/Demo/Rename.txt");
		Path rename = Paths.get("/Users/sridaransivakumar/Desktop/Demo/abcd.txt");
        
		// TODO: handle exception
		try {
			Files.move(file, rename);
			System.out.println("File Renamed");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

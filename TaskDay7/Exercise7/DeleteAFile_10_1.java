package Exercise7;

import java.io.File;

public class DeleteAFile_10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       File file;
       try {
    	   boolean val=true;
    	   while(val) {
    	    file=new File("/Users/sridaransivakumar/Desktop/Demo/demo.txt");
    	    if(file.exists()) {
    	    	 file.deleteOnExit();
    	    	 System.out.println("File is deleted "+file.getAbsolutePath());
    	    	 val=false;
    	    }else {
    	    file.createNewFile();
    	      System.out.println("File is created "+file.getAbsolutePath());
    	    }
    	   }
       }catch (Exception e) {
		// TODO: handle exception
    	   e.printStackTrace();
	}
	}

}

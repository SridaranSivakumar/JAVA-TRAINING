package TaskDay4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberFormatException_8_and_9 {
    static int  total=0;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of students");
		int students=sc.nextInt();
		sc.nextLine();
       int studentsmarks[]=new int[students];
       for(int i=0;i<students;) {
    	  
       try {
    	   System.out.println("Enter the Mark of students"); 
    	  
    	   int marks=sc.nextInt();
    	   checkNumbers(marks);
    	  studentsmarks[i]=marks;
    	  
    	 //ystem.out.println();
    	  total+=studentsmarks[i];
    	  i=i+1;
    	  }catch(InputMismatchException ie){
    		  
    		 
    		  System.out.println("Enter the valid Numbers not String");
    		  sc.next();

    	  }catch(NumberOutOfRangeException nr) {
    		  System.out.println(nr);
    	  }
       catch (Exception e) {
		// TODO: handle exception
    	   e.printStackTrace();
//    	  System.out.println("Enter the valid number"); 
//    	  i=i-1;
	}
       
	}
       System.out.println("the total mark is: "+total);
	}
	public static void checkNumbers(int marks) throws NumberOutOfRangeException {
		// TODO Auto-generated method stub
		if(marks<0 || marks>100) {
			throw new NumberOutOfRangeException("Number must be with in 0 to 100");
		}
	}

}
class NumberOutOfRangeException extends Exception{
	String str;
	public NumberOutOfRangeException(String str) {
		// TODO Auto-generated constructor stub
		this.str=str;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return str;
	}
}
//exception type and no of students
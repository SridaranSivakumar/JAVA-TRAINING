package Day1Task;
import java.util.*;
public class DaysInMonth_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the month: ");
    int month=sc.nextInt();
    System.out.println("Enter the year: ");
    int year=sc.nextInt();
    switch(month) {
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
    	System.out.println("The no of days: 31");
           break;
    case 4:
    case 6:
    case 9:
    case 11:
    
    	System.out.println("The no of Days:30 ");
    	break;
    case 2:
    	if((year%4==0 && year%100!=0 )|| year%400==0) {
    		System.out.println("This is leap year and no of days is: 29");
    	}else {
    		System.out.println("This is not a leap year and no of days is: 28");
    	}
    	break;
    	default :
    		System.out.println("Invalid Month");
    		break;
    	
}

	}

}

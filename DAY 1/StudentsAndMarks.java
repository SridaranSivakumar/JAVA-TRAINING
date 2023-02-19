package Day1Task;

import java.util.Scanner;

public class StudentsAndMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int students=sc.nextInt();
		int[] Answer=new int[students];
		int[][] array=new int[students][5];
        for(int i=0;i<students;i++) {
        	int count=0;
    		int Ans=0;
        	for(int j=0;j<5;j++) {
        		array[i][j]=sc.nextInt();
        		 count+=array[i][j];
        		}
        	 Ans=count/5;
        	 Answer[i]=Ans ;       	 
        }
        for(int i=0;i<students;i++) {
        	System.out.println(Answer[i]);
        }
	}

}

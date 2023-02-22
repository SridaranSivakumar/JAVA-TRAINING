package Day3task;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

interface stack{
	public void push(int n);
	public void pop();
	
}
class FixedStack implements stack{
	int a[]=new int[3];
	   int count=0;
       int len=a.length;
	 public void push(int n) {
	   	  
	   if(count>a.length-1) {
		  
		   System.out.println("Stack is full");
		   
	   }else {
		   a[count++]=n	;	   
		  		 
		 System.out.println(count);
		
	   }
	   
	 }
	 public void pop() {
		 if(len==a.length) {
			 --len;
		 }
         if(len==0)
         {
                 System.out.println("Stack Underflows");

         }else {
        	 a[len--]=0;
         }
        
         
	 }
}
class DynamicStack implements stack{
	List<Integer> list=new ArrayList<Integer>();

	@Override
	public void push(int n) {
		// TODO Auto-generated method stub
		list.add(n);
	}
        int a=list.size();
	@Override
	public void pop() {
		// TODO Auto-generated method stub
		if(list.isEmpty()) {
			System.out.println("Stack Underflows");
			
		}else {
			list.remove(a);
			
		}
	}
	
	
}
public class StackPushPop_3 {

	public static void main(String[] args) {
		FixedStack fix=new FixedStack();
		fix.push(4);
		fix.push(3);
		fix.push(55);
		fix.push(66);
		fix.push(66);
		fix.pop();
		fix.pop();
		fix.pop();
		fix.pop();
		System.out.println();
		DynamicStack d=new DynamicStack();
		d.push(4);
		d.push(3);
		d.push(55);
		d.push(66);
		d.push(66);
        d.pop();
		d.pop();
		d.pop();
		d.pop();
		d.pop();
        d.pop();
        d.pop();
		d.pop();
        d.pop();


	}

}

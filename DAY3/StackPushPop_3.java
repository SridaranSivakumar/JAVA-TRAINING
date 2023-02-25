package Day3task;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

interface stack{
	public void push(int n);
	public void pop();
	
}
class fixededStack implements stack{
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
		System.out.println(list);
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
		fixededStack fixed=new fixededStack();
		System.out.println("The element in the fixed stack :");
		fixed.push(4);
		fixed.push(3);
		fixed.push(55);
		fixed.push(66);
		fixed.push(66);
		fixed.pop();
		fixed.pop();
		fixed.pop();
		fixed.pop();
		System.out.println();
		DynamicStack dynamic=new DynamicStack();
		System.out.println("The element in the dynamic stack :");
		dynamic.push(4);
		dynamic.push(3);
	    dynamic.push(55);
	    dynamic.push(66);
	    dynamic.push(66);
	    dynamic.pop();
	    dynamic.pop();
	    dynamic.pop();
	    dynamic.pop();
	    dynamic.pop();
	    dynamic.pop();
	    dynamic.pop();
	    dynamic.pop();
	    dynamic.pop();
		
       


	}

}

package TaskDay2;

import java.util.Stack;

public class Stack_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Stack<Integer> stack=new Stack<>();
    int arr[]= {5,23,45,66};
    for(int i=0;i<arr.length;i++) {
    	stack.push(arr[i]);
    }
    System.out.println("Stack is  "+stack);
	}

}

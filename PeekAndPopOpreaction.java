package com.JavaCollection;

import java.util.LinkedList;
// create the class
public class PeakAndPopOperation {

	
	public static void main(String[] args) {
		LinkedList<Integer>number=new LinkedList<Integer>();
		//push()method is used to add the number
		number.push(70);
		number.push(30);
		number.push(56);
	//print the number	
	System.out.println(number);
	
	//peek () method is used to get top number
	System.out.println("Top  element is:"+number.peek());
	
	
	// pop() method is used to delete
	number.pop();
	System.out.println(number);
	
	//pop() method is used to  delete
	number.pop();
	number.pop();
	
	System.out.println(number);
}
}

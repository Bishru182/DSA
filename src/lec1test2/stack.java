package lec1test2;

public class stack {
	private int maxSize;
	private int top;
	private char array[];
	
	public stack(int s) {
		
		this.maxSize = s ;
		top = -1;
		array = new char [maxSize];
	}
	
	public void push(char j) {
		if(isFull()) {
			System.out.println("stack is full");
		}else {
			array[++top]=j;
			//System.out.println(array[top]);
		}
	}
	
	public char pop() {
		if(isEmpty()) {
			return 'f';
		}else {
			return array[top--];
		}
	}
	
	public double peek() {
		if(isEmpty()) {
			return -99;
		}else {
			return array[top];
		}
	}
	
	public boolean isFull() {
		if(top==maxSize-1) {
			return true ;
		}else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(top== -1) {
			return true ;
		}else {
			return false;
		}
	}
	
	

}

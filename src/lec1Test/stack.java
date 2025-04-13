package lec1Test;



public class stack {
	private int maxSize;
	private int top;
	private int array[];
	
	public stack(int s) {
		this.maxSize = s;
		top = -1;
		array = new int[this.maxSize];
	}
	
	public void push(int j) {
		if(isFull()) {
			System.out.println("stack is full");
		}else {
			array[++top]=j;
		}
	}
	
	public double pop() {
		if(isEmpty()) {
			return -99;
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
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(top == maxSize-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public void display() {
		System.out.print("Stack elements: ");
		for(int i=0;i<=top;i++) {
			System.out.print(array[i]+","+"");
		}
		System.out.println();
		
	}
	

}

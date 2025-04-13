package lec1test3;

public class stack {
	private int maxSize;
	private int top;
	private int array[];
	
	public stack(int s) {
		this.maxSize = s;
		top = -1;
		array = new int[maxSize];
	}
	
	public void push(int j) {
		if(isFull()) {
			System.out.println("stack is full");
		}else {
			array[++top]=j;
		}
	}
	
	public int pop () {
		if(isEmpty()) {
			return -99;
		}else {
			return array[top--];
		}
	}
	
	public int peek () {
		if(isEmpty()) {
			return -99;
		}else {
			return array[top];
		}
	}
	
	public boolean isFull() {
		if(top==maxSize-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(top== -1) {
			return true;
		}else {
			return false;
		}
	}
	public void display(int num){
		for(int i=0;i<num;i++) {
			System.out.print(array[i]+","+"");
		}
	}
	
	

}

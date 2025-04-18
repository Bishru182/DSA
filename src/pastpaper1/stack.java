package pastpaper1;

public class stack {
	private int maxSize;
	private char array[];
	private int top;
	
	public stack(int s) {
		this.maxSize = s;
		array = new char [maxSize] ;
		top = -1;
	}
	
	public void push(char j) {
		if(isFull()) {
			System.out.println("stack is full");
		}else {
			array[++top]=j;
		}
	}
	
	public char pop () { 
		if(isEmpty()) {
			return 'f';
		}else {
			return array[top--];
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
		if(top==-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public void display() {
		System.out.println("stack: ");
		for(int i=0;i<5;i++) {
			System.out.println(array[i]);
		}
	}

}

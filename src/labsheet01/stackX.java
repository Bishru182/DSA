package labsheet01;

public class stackX {
	private int maxSize;
	private int top;
	private char array[];
	
	public stackX(int i) {
		this.maxSize=i;
		top=-1;
		array=new char[maxSize];
		
	}
	
	public void push(char j) {
		if(isFull()) {
			System.out.println("stack is full");
		}else {
			array[++top]=j;
		}
		
	}
	
	public char pop() {
		if(isEmpty()) {
			return '\0';
		}else {
			return array[top--];
		}
		
	}
	
	public char peek() {
		if(isEmpty()) {
			return '\0';
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
		if(top==-1) {
			return true;
		}else {
			return false;
		}
	}

}

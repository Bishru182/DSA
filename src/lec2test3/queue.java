package lec2test3;

public class queue {
      private int maxSize;
      private int array[];
      private int rear;
      private int front ;
      private int nItems;
      
	public queue(int s) {
		super();
		this.maxSize = s;
		array = new int [maxSize];
		rear = -1;
		front = 0;
		nItems = 0;
	}
	
	public void insert(int j) {
		if(isFull()) {
			System.out.println("queue is full");
		}else {
			array[++rear]=j;
			nItems++;
		}
	}
	
	public int remove () {
		if(isEmpty()) {
			return -99;
		}else {
			nItems--;
			return array[front++];
		}
	}
	
	public int peek () {
		if(isEmpty()) {
			return -99;
		}else {
			return array[front];
		}
		
	}
	
	public boolean isFull() {
		if(rear==maxSize-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(nItems==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void displayReverse() {
		System.out.print("after: ");
		for(int i=4;i>=front;i--) {
			System.out.print(array[i]+","+"");
		}
	}
	
	public void display() {
		System.out.print("before: ");
		for(int k=0;k<nItems;k++) {
			System.out.print(array[k]+","+"");
		}
	}
      
      
      
}

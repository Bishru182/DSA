package lec2test1;

public class Queue {
	private int maxSize;
	private int rear;
	private int front;
	private int array[];
	private int nItems;
	
	public Queue(int s) {
		this.maxSize = s;
		rear = -1;
		front = 0;
		array = new int[maxSize];
		nItems = 0;
	}
	
	public void insert(int j) {
		if(isFull()) {
			System.out.println("Queue is full");
		}else {
			array[++rear]=j;
			nItems ++;
		}
		
	}
	
	public int remove() {
		if(isEmpty()) {
			return -99;
		}else {
			nItems --;
			return array[front ++];
		}
		
	}
	
	public int peek() {
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
	
	public void display() {
		for(int i=front;i< 5;i++) {
			System.out.print(array[i]+","+"");
		}
		System.out.println();
	}
	
	

}

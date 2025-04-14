package lec2Test2;

public class queue {
	private int maxSize;
	private int array[];
	private int rear;
	private int front;
	private int nItem;
	
	public queue(int s) {
		this.maxSize = s;
		array = new int [maxSize];
		rear = -1;
		front = 0;
		nItem = 0;
	}
	
	public void insert(int j) {
		if(isFull()) {
			System.out.println("queue is full");
		}else {
			array[++rear]=j;
			nItem++;
		}
		
	}
	
	public int remove () {
		if(isEmpty()) {
		   return -99;	
		}else {
			nItem --;
			return array[++front];
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
		if(nItem==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void display(int a) {
		for(int i =0;i<a;i++) {
			System.out.print(array[i]+","+"");
		}
	}
	
	
	
	
	

}

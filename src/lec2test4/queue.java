package lec2test4;

public class queue {
	private int maxSize;
	private char array[];
	private int rear;
	private int front;
	private int nItems;
	
	public queue(int s) {
		this.maxSize = s;
		array = new char [maxSize];
		rear = -1;
		front = 0;
		nItems = 0;
	}
	
	public void insert(char j) {
		if(isFull()) {
			System.out.println("queue is full");
		}else {
			array[++rear]=j;
					nItems++;
		}
	}
	
	public int remove() {
		if(isEmpty()) {
			return -99;
		}else {
			return array[front++];
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
		}
		else {
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
		for(int i =0;i<this.maxSize;i++) {
			System.out.println(array[i]);
		}
	}
	
	public void displayReverse() {
		for(int k=this.maxSize-1;k>=0;k--) {
			System.out.print(array[k]);/*lets say you have 5 letters, then the maxSize is 5
			                              instead of 'int k=this.maxSize-1', if u use 'int k=this.maxSize',array[k]
			                              will be array[5]. but there's no array with an index of 5...finishes with 
			                              index 4*/
		}
	}

	}

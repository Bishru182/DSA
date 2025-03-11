package labsheet02;

public class queue {
	private int maxSize;
	private int front;
	private int rear;
	private int array[];
	private int nItems;
	
	public queue(int s) {
		maxSize=s;
		front=0;
		rear=-1;
		nItems=0;
		array = new int[maxSize];
	}
	
	public void insert(int n) {
		if(rear==maxSize-1) {
			System.out.println("queue is full");
		}else {
			array[++rear]=n;
			nItems++;
			System.out.println(array[rear]);
		}
	}
	
	public int remove() {
		if(nItems==0) {
			return -99;
		}else {
			nItems--;
			return array[front++];
		}
	}
	
	public int peekFront() {
		if(nItems==0) {
			return -99;
		}else {
			return array[front];
		}
	}
	
	public void display() {
		for(int j=front;j<maxSize;j++) {
			System.out.println(array[j]);
		}
	}

}

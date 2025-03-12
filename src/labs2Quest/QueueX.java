package labs2Quest;

public class QueueX {
	private int maxSize;
	private int rear;
	private int front;
	private int noItems;
	private int queueArr[];
	
	public QueueX(int s) {
		maxSize=s;
		rear=-1;
		front=0;
		noItems=0;
		queueArr=new int[this.maxSize];
	}
	
	public void insert(int j) {
		if(isFull()) {
			System.out.println("queue is full");
		}else {
			queueArr[++rear]=j;
			//System.out.println(queueArr[rear]);
		}
	}
	
	public int remove() {
		if(isEmpty()) {
			return -99; 
		}else {
			return queueArr[front++];
		}
	}
	
	public boolean isEmpty() {
		if(noItems==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(rear==maxSize-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public void display() {
		for(int j=0;j<5;j++) {
			System.out.println(queueArr[j]);
		}
	}

}

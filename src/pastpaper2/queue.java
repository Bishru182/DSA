package pastpaper2;

public class queue { 
	private int maxSize;
	private char array[];
	private int rear;
	private int front;
	private int nItems;
	
	public queue(int s) {
	
		this.maxSize = s ;
		array = new char[maxSize];
		rear = -1;
		front = 0;
		nItems = 0;
	}
	
	public void insert(char j) {
		if(nItems==maxSize) {
			System.out.println("queue is full");
		}else {
			if(rear==maxSize-1) {
				rear=-1;
			}
			array[++rear]=j;
			nItems++;
		}
	}
	
	public char remove() {
		if(nItems==0) {
			return 'f';
		}else {
			char temp=array[front++];
			if(front==maxSize) {
				front=0;
			}
			nItems--;
			return temp;
		}
	}
	
	public int peek() {
		if(nItems==0) {
			return -99;
		}else {
			return array[front];
		}
	}
	
	public void display() {
		for(int i =0;i<10;i++) {
			System.out.print(array[i]+","+"");
		}
	}

}

package pastpaper1;

public class queue {
  private int maxSize;
  private char array[];
  private int rear;
  private int front;
  private int nItems;
  
public queue(int s) {
	this.maxSize = s;
	array = new char[maxSize];
	rear = -1;
	front = 0;
	nItems = 0;
}

public void insert(char j) {
	if(isFull()) {
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
	if(isEmpty()) {
		return 'f';
	}else {
		nItems--;
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
	if(nItems==maxSize) {
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
	for(int i=0;i<nItems;i++) {
		System.out.print(array[i]);
	}
}

}



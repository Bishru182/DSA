package lab2;


public class mainApp1 {
	public static void main(String[]args) {
		queue1 q1 = new queue1(5);
		
		System.out.println("inserting values to the queue");
		q1.insert(10);
		q1.insert(20);
		q1.insert(30);
		q1.insert(40);
		q1.insert(50);
		q1.insert(60);
		
		//q1.display();
		System.out.println("");
		
		int val=q1.remove();
		System.out.println("removed:"+val);
		
		System.out.println("");
		
		System.out.println("queue after removal");
		q1.display();
		
		System.out.println("");
		int p=q1.peekFront();
		System.out.println("peek value:"+p);
		
	}

}

package lec2test1;

public class queueApp {
	public static void main(String[]args) {
			Queue q1 = new Queue(5);
			
			q1.insert(0);
			q1.insert(10);
			q1.insert(20);
			q1.insert(30);
			q1.insert(40);
			q1.insert(50);
			
			q1.display();
			
			System.out.println(q1.remove());
			System.out.println(q1.peek());
			
			q1.display();
	}

}

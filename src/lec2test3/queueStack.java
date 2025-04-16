package lec2test3;

public class queueStack {
	public static void main(String[]args) {
		queue q1 = new queue(5);
		q1.insert(0);
		q1.insert(10);
		q1.insert(20);
		q1.insert(30);
		q1.insert(40);
		
		q1.display();
		System.out.println();
		q1.displayReverse();
		q1.remove();
		System.out.println();
		System.out.println("removing the peek");
		q1.displayReverse();
	}

}

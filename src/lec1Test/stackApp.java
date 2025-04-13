package lec1Test;

public class stackApp {
	public static void main(String[]args) {
		stack st1 = new stack(5);
		st1.push(10);
		st1.push(20);
		st1.push(30);
		st1.push(40);
		st1.push(50);
		st1.push(60);
		
		st1.display();
		
		System.out.println("popped:"+st1.pop());
		System.out.println("peek:"+st1.peek());
		
		st1.display();
	}

}

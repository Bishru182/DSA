package pastpaper1;
import java.util.Scanner;

public class main {
	public static void main(String[]args) {
		Scanner scanner= new Scanner(System.in);
		queue q1 = new queue(5);
		stack st1 = new stack(5);
		
		for(int i=0;i<5;i++) {
			System.out.println("enter the characters:");
			char ch = scanner.next().charAt(0);
			q1.insert(ch);
		}
		
		System.out.println("before");
		q1.display();
		System.out.println();
		
		for(int i=0;i<5;i++) {
		  st1.push(q1.remove());	
		}
		
		//st1.display();
		
		for(int i=0;i<5;i++) {
			q1.insert(st1.pop());
		}
		
		System.out.println("after");
		q1.display();
	}

}

package pastpaper2;
import java.util.Scanner;

public class main {
   public static void main (String[] args) {
	Scanner scanner = new Scanner(System.in);
	queue q1 = new queue(10);
	stack s1 = new stack(5);
	queue q2 = new queue(5);
	
	for(int i=0;i<5;i++) {
		System.out.println("enter the char:");
		char ch= scanner.next().charAt(0);
		q1.insert(ch);	
	}
	//q1.display();
	
	for(int i=0;i<5;i++) {
		char val=q1.remove();
		q2.insert(val);
		s1.push(val);
	}
	/*q2.display();
	System.out.println();
	s1.display();*/
	
	
	for(int i=0;i<5;i++) {
		q1.insert(q2.remove());
	}
	
	for(int i=0;i<5;i++) {
		q1.insert(s1.pop());
	}
	
	q1.display();
}

}

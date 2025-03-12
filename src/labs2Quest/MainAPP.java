package labs2Quest;
import java.util.Scanner;

public class MainAPP {
	public static void main(String[]args) {
		Scanner scanner = new Scanner (System.in);
		QueueX q1 = new QueueX(5);
		
		for(int i=0;i<5;i++) {
			System.out.println("enter transaction ID "+(i+1));
			int val = scanner.nextInt();
			q1.insert(val);
		}
		System.out.println("");
		q1.display();
		
		
	}

}

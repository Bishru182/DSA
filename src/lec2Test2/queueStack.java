package lec2Test2;

import java.util.Scanner;
public class queueStack {
	public static void main (String[]args) {
		Scanner sc1 = new Scanner(System.in);
		queue q1 = new queue(5);
		queue even = new queue(5);
		queue odd = new queue(5);
		int evnCnt=0;
		int oddCnt=0;
		
		for(int i =0; i<5;i++) {
			System.out.println("enter a number:");
			int num= sc1.nextInt();
			
			if(num%2==0) {
				even.insert(num);
				evnCnt++;
			}else {
				odd.insert(num);
				oddCnt++;
			}
		}
		
		System.out.print("even numbers:");
		even.display(evnCnt);
		System.out.println();
		System.out.print("odd numbers:");
		odd.display(oddCnt);
	}

}

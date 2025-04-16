package lec2test4;

import java.util.Scanner;
public class queueApp {
	public static void main(String[]args) {
		Scanner scanner= new Scanner (System.in);
		System.out.println("enter the string: ");
		String expression=  scanner.next();
		
		queue q1 = new queue(expression.length());
		
		for(char ch:expression.toCharArray()) {
			q1.insert(ch);
		}
		
		q1.displayReverse();
		
	}

}

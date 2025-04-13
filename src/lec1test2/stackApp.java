package lec1test2;

import java.util.Scanner;

public class stackApp {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter string:");
		String name=scanner.nextLine();
		
		stack st1 = new stack(name.length());
		int expression=name.length();
		
		for(char ch:name.toCharArray()) {
		st1.push(ch);
		}
		 for(int p=0;p< expression;p++) {
			 System.out.print(st1.pop());
		 }
		}
		
	}



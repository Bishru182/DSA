package labsheet01;
import java.util.Scanner;

public class stackApp {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter:");
		String expression=scanner.nextLine();
		
		if(isValid(expression)) {
			System.out.println("paranthesis is valid");
		}else {
			System.out.println("paranthesis is invalid");
		}
		scanner.close();
	}
	
	public static boolean isValid(String expression) { 
		stackX stack = new stackX(expression.length());
		for(char ch:expression.toCharArray()) {
			if(ch=='('||ch=='['||ch=='{') {
				stack.push(ch);
			}else if(ch==')'||ch==']'||ch=='}') {
				if(stack.isEmpty()) {
					return false;
					
				}else {
					char top= stack.pop();
					if(ch==')'&&top!='('||
				       ch==']'&&top!='['||
				       ch=='}'&&top!='{') {
						return false;
					}
				}
				
			}
			
		}
		
		return stack.isEmpty();
		
	}


}

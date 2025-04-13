package lec1test3;
import java.util.Scanner;

public class stackApp {
	public static void main(String[]main) {
		Scanner scanner =new Scanner(System.in);
		stack st1 = new stack(5);
		stack even = new stack(5);
		stack odd = new stack(5);
		
		int evenCnt=0;
		int oddCnt=0;
		
		
		for(int n=0;n<5;n++) {
			System.out.println("enter the number:");
		    int val= scanner.nextInt();
		    st1.push(val);
		}
		
		//System.out.println(st1.pop());
		
		for(int a=0;a<5;a++) {
			int exp =st1.pop();
			if (exp%2==0) {
				even.push(exp);
				evenCnt++;
			}else {
				odd.push(exp);
				oddCnt++;
			}
		}
		
		//printing even number from even stack 
		even.display(evenCnt);
		
		System.out.println();
		
		//printing even number from even stack 
				odd.display(oddCnt);
	}

}

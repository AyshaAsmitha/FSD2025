package Session2;

import java.util.Scanner;

public class conditionalstatement {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter your age:");
		int age =sc.nextInt();
		if(age>18) {
			System.out.println("eligable to vote");
		}else {
			System.out.println("not eligable to vote");
		}
		
	}
}

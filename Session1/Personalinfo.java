package Session1;

import java.util.Scanner;

public class Personalinfo {
	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter ur mobile no:");
		int mob = obj.nextInt();
		
		obj.nextLine();
		
		System.out.println("Enter ur name:");
		String name = obj.nextLine();
		
		System.out.println("Enter ur address:");
		String addr = obj.next();
		
		System.out.println("Info entered");
	}

}

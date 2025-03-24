package Session2;

import java.util.Scanner;

public class switchcase {

	   public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("1. Addition");
		System.out.println("2. Subraction");
		System.out.println("3. Mulitiplication");
		System.out.println("4. Division");
		
	   System.out.println("enter your choice (1/2/3/4): ");
	int choice=sc.nextInt();

	System.out.println("enter first number:");
	double num1=sc.nextDouble();
	System.out.println("enter second number:");
	double num2=sc.nextDouble();

	double result;
	switch(choice)
	{
	case 1:
		result = num1 + num2;
		System.out.println("Result:"+result);
	    break;
	case 2:
		result = num1 - num2;
		System.out.println("Result:"+result);
	    break;
	case 3:
		result = num1 * num2;
		System.out.println("Result:"+result);
	    break;
	case 4:
	    if(num2 !=0)
	{
		  result = num1 / num2;
		  System.out.println("Result:"+result);
	  }
	else 
	{
		System.out.println("error:Division by zero not allowed");
	  }
	}
	   }
}







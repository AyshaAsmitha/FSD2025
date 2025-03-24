package Session2;

public class operators {
	
	public static void main(String[] args) {
		int a=5,b=18;
		
		//arithmetic
		System.out.println("Addtiton"+(a+b));
		System.out.println("subraction"+(a-b));
		System.out.println("multiplication"+(a*b));
		
		//relational
		System.out.println("equal to"+(a==b));
		System.out.println("not equal"+(a!=b));
		System.out.println("greater than"+(a>b));
		System.out.println("less than equal to"+(a<=b));
		
		//logical
		boolean condition1 = true, condition2 = false;
		
		System.out.println("logical AND"+(condition1 && condition2));
		System.out.println("logical OR"+(condition1 || condition2));
		System.out.println("logical NOT"+(!condition1));
		
		//unary
		System.out.println("unary negation"+(~a));
		System.out.println("unary nrgation"+(~b));
		System.out.println("post increment"+(a++));
		System.out.println("pre decrement"+(--b));
 		
		//assignment
		a+=5; //a =a+5
		System.out.println("+=:"+a);
		
		//ternary?:
		String res = (a>b)?"a is greater" : "b is greater";
		System.out.println("result: "+ res);
	}
}

//method without argument example
// in main method we are simply calling the method without passing values so it is called as method without argument

import java.util.*;
class mwithoutarg{
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	
	void add(){
		
		System.out.println("Enter value of a :");
		a=sc.nextInt();
		System.out.println("Enter value of b :");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Answer is : "+c);
		System.out.println();
	}
	
	void sub(){
		
		System.out.println("Enter value of a :");
		a=sc.nextInt();
		System.out.println("Enter value of b :");
		b=sc.nextInt();
		c=a-b;
		System.out.println("Answer for is : "+c);
		System.out.println();
	}
	void mul(){
		
		System.out.println("Enter value of a :");
		a=sc.nextInt();
		System.out.println("Enter value of b :");
		b=sc.nextInt();
		c=a*b;
		System.out.println("Answer for is : "+c);
		System.out.println();
	}
	public static void main(String[] args){
		mwithoutarg m = new mwithoutarg();
		System.out.println("Addition is performed below");
		m.add();
		System.out.println("Subtraction is performed below");
		m.sub();
		System.out.println("Multiplication is performed below");
		m.mul();
	}
	
}
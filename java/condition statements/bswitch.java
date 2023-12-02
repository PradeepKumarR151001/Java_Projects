import java.util.*;
class bswitch{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		String ch;
		
		System.out.println("Enter value of a :");
		a=sc.nextInt();
		
		System.out.println("Enter value of b :");
		b=sc.nextInt();
		
		System.out.println("Type your choice :");
		System.out.println("Type & to perform bitwise AND");
		System.out.println("Type | to perform bitwise OR");
		System.out.println("Type ^ to perform bitwise XOR");
		System.out.println("Type ~a to perform bitwise COMPLIMENT of a");
		System.out.println("Type ~b to perform bitwise COMPLIMENT of b");
		System.out.println("Type << to perform bitwise LEFT SHIFT BY 2 on a");
		System.out.println("Type >> to perform bitwise RIGHT SHIFT BY 2 on b");
		
		ch=sc.next();
		
		switch(ch){
			case "&":
				c=a&b;
				System.out.println("Value for a&b is :"+c);
				break;
			
			case"|":
				c=a|b;
				System.out.println("Value for a|b is :"+c);
				break;
			
			case"^":
				c=a^b;
				System.out.println("Value for a^b is :"+c);
				break;
			
			case"~a":
				c=~a;
				System.out.println("Value for ~a is :"+c);
				break;
			
			case"~b":
				c=~b;
				System.out.println("Value for ~b is :"+c);
				break;
				
			case"<<":
				c=a<<2;
				System.out.println("Value for a<<2 is :"+c);
				break;
				
			case">>":
				c=b>>2;
				System.out.println("Value for b>>2 is :"+c);
				break;
				
			default:
				System.out.println("Enter valid choice");
		}
		
	}
}
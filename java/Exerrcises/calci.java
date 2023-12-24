import java.util.*;

class calci{
		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);
			double a,b,c;
			String ch;
			
			System.out.println("Enter the value of a : ");
			a=sc.nextDouble();
			
			System.out.println("Enter the value of b : ");
			b=sc.nextDouble();
			
			System.out.println("Enter the operation you need to perform ");
			System.out.println("Enter + for Addition ");
			System.out.println("Enter - for Subtraction ");
			System.out.println("Enter * for Multiplication ");
			System.out.println("Enter / for Division ");
			System.out.println("Enter % for Modulus ");
			
			ch=sc.next();
			
			switch(ch){
				case("+"):
					c=a+b;
					System.out.println("Answer is "+c);
					break;
					
				case("-"):
					c=a-b;
					System.out.println("Answer is "+c);
					break;
					
				case("*"):
					c=a*b;
					System.out.println("Answer is "+c);
					break;
					
				case("/"):
					c=a/b;
					System.out.println("Answer is "+c);
					break;
					
				case("%"):	
					c=a%b;
					System.out.println("Answer is "+c);
					break;
					
				default:
					System.out.println("Enter valid choice ");
					break;
			}
		}
}
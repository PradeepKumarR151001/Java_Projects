import java.util.*;
class arithmetic{
	public static void main(String [] args){
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a : ");
		a = sc.nextDouble();
		System.out.println("Enter value for b : ");
		b = sc.nextDouble();
		System.out.println("Arithmetic operations are performed : ");
		c=a+b;
		System.out.println("While adding the answer is :"+c);
		c=a-b;
		System.out.println("While Subtracting the answer is :"+c);
		c=a*b;
		System.out.println("While Multiplying the answer is :"+c);
		c=a/b;
		System.out.println("While Dividing the answer is :"+c);
		c=a%b;
		System.out.println("While taking Modulus the answer is :"+c);
		
	}
}
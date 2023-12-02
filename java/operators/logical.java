import java.util.*;
class logical{
	public static void main(String[] args){
		double a,b,c;
		boolean result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		a = sc.nextDouble();
		System.out.println("Enter the value of b :");
		b = sc.nextDouble();
		System.out.println("Enter the value of c :");
		c = sc.nextDouble();
		System.out.println("Logical Operations are performed :");
		result=(a>b) || (a>c);
		System.out.println("While performing OR(a>b) || (a>c) answer is "+result);
		result=(a>b) && (a>c);
		System.out.println("While performing AND(a>b) && (a>c) answer is "+result);
		result=(a!=b);
		System.out.println("While performing NOT on A and B(a!=b), answer is "+result);
		
	}
}
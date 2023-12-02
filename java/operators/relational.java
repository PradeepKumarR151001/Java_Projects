import java.util.*;
class relational{
	public static void main(String [] args){
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a:");
		a=sc.nextDouble();
		System.out.println("Enter value of b:");
		b=sc.nextDouble();
		System.out.println("Relational operations is performed :");
		System.out.println("a==b "+(a==b));
		System.out.println("a>b "+(a>b));
		System.out.println("a<b "+(a<b));
		System.out.println("a!=b "+(a!=b));
		System.out.println("Ternary operation is performed :");
		c=(a>b)?a:b;
		System.out.println(c);
	}
}
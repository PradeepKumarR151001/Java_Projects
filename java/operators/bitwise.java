import java.util.*;
class bitwise{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter value of a : ");
		a= sc.nextInt();
		System.out.println("Enter value of b : ");
		b=sc.nextInt();
		System.out.println("Bitwise operations are performed :");
		c=a|b;
		System.out.println("While performing a|b answer is :"+c);
		c=a&b;
		System.out.println("While performing a&b answer is :"+c);
		c=a^b;
		System.out.println("While performing a^b answer is :"+c);
		c=~b;
		System.out.println("While performing ~b answer is :"+c);
		c=~a;
		System.out.println("While performing ~a answer is :"+c);
		c=b>>2;
		System.out.println("While performing >>b answer is :"+c);
		c=b<<2;
		System.out.println("While performing <<b answer is :"+c);
		
	}
}
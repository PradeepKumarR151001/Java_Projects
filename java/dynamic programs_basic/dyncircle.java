import java.util.*;
class dyncircle{
	public static void main(String[] args){
		int r;
		double pi,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of radius : ");
		r=sc.nextInt();
		System.out.println("Enter value of Pi : ");
		pi=sc.nextDouble();
		c=pi*r*r;
		System.out.println("Area of Circle is :"+c);
	}
}
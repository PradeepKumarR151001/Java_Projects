import java.util.*;

class smallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		System.out.println("Enter the value of a :");
		a = sc.nextDouble();
		System.out.println("Enter the value of b :");
		b = sc.nextDouble();
		System.out.println("Enter the value of c :");
		c = sc.nextDouble();
		if (a == b && b == c) {
			System.out.println("All three numbers are same  ");
		} else if (a < b && a < c) {
			System.out.println("a is the smallest of all numbers");
		} else if (b < a && b < c) {
			System.out.println("b is the smallest of all numbers");
		} else
			System.out.println("c is the smallest of all numbers");
	}
}
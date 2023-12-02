import java.util.*;

class rswitch {
	public static void main(String[] args) {

		double a, b;
		String ch;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of a :");
		a = sc.nextDouble();

		System.out.println("Enter the value of b :");
		b = sc.nextDouble();

		System.out.println("Type your choice :");
		System.out.println("Type > to Check Greater than");
		System.out.println("Type < to Check Less than");
		System.out.println("Type == to Check Equality");

		ch = sc.next();

		switch (ch) {
			case ">":
				if (a > b) {
					System.out.println("a is greater than b");
				} else
					System.out.println("b is greater than a");
				break;
			case "<":
				if (a < b) {
					System.out.println("a is smaller than b");
				} else
					System.out.println("b is smaller than a");
				break;
			case "==":
				if (a == b) {
					System.out.println("Both numbers are same");
				} else
					System.out.println("Both numbers are not same");
				break;
			default:
				System.out.println("Enter valid choice");
		}
	}
}
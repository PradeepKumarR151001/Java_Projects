import java.util.*;

class switched {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		String ch;
		System.out.println("Enter the operation you need to perform (+,-,*,/,%)");
		ch = sc.next();
		System.out.println("Enter value of a :");
		a = sc.nextInt();
		System.out.println("Enter value of b :");
		b = sc.nextInt();

		switch (ch) {
			case "+":
				c = a + b;
				System.out.println("Answer is :" + c);
				break;
			case "-":
				c = a - b;
				System.out.println("Answer is :" + c);
				break;
			case "*":
				c = a * b;
				System.out.println("Answer is :" + c);
				break;
			case "/":
				c = a / b;
				System.out.println("Answer is :" + c);
				break;
			case "%":
				c = a % b;
				System.out.println("Answer is :" + c);
				break;

			default:
				System.out.println("Enter valid operator ");
		}

	}
}
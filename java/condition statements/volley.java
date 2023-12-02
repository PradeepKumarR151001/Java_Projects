import java.util.*;

class volley {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age :");
		a = sc.nextInt();
		System.out.println("Enter your height in centimetres :");
		b = sc.nextInt();
		if (a < 15) {
			System.out.println("You are too young to participate");
		} else {
			if (b < 100) {
				System.out.println("You are too short to play the game");
			} else
				System.out.println("You are eligible to participate");
		}

	}
}
import java.util.*;

class nested {
	public static void main(String[] args) {
		int a, w;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age :");
		a = sc.nextInt();
		System.out.println("Enter your weight :");
		w = sc.nextInt();
		if (a >= 18) {
			if (a >= 60) {
				System.out.println("Sorry,You are too old to donate blood");
			} else {
				if (w >= 50) {
					System.out.println("You age eligible to donate blood");
				} else {
					System.out.println("You dont have enough weight to donate blood");
				}
			}
		} else {
			System.out.println("You are too young to donate blood");
		}
	}
}
import java.util.*;

public class countnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countPositive = 0;
        int countNegative = 0;

        System.out.println("Enter a sequence of numbers (enter 0 to stop):");

        while (true) {
            int number = sc.nextInt();

            if (number == 0) {
                break; 
            } else if (number > 0) {
                countPositive++;
            } else {
                countNegative++;
            }
        }

        System.out.println("Count of positive numbers: " + countPositive);
        System.out.println("Count of negative numbers: " + countNegative);
    }
}

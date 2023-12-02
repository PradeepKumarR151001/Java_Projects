import java.util.*;

class incremental {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        a = sc.nextDouble();
        System.out.println("Incremental Operations and Decremental Operations are performed as follows");
        System.out.println("Value of a currently is: " + a);

        // Postfix increment
        b = a++;
        System.out.println("Value of a after postfix increment is: " + b);

        // Prefix decrement
        b = --a;
        System.out.println("Value of a after prefix decrement is: " + b);

        // Postfix decrement
        b = a--;
        System.out.println("Value of a after postfix decrement is: " + b);

        // Prefix increment
        b = ++a;
        System.out.println("Value of a prefix increment is: " + b);

        System.out.println("Value of a currently is: " + a);

        a += 3;
        System.out.println("Value of a after short-term increment by 3 is: " + a);
    }
}

import java.util.*;

class lswitch {
    public static void main(String[] args) {
        boolean a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a (only true or false):");
        a = sc.nextBoolean();

        System.out.println("Enter value of b (only true or false):");
        b = sc.nextBoolean();

        System.out.println("Type your choice:");
        System.out.println("Type && for LOGICAL AND");
        System.out.println("Type || for LOGICAL OR");
        System.out.println("Type ! for LOGICAL NOT");

        String ch = sc.next();

        switch (ch) {
            case "&&":
                c = a && b;
                System.out.println("Ans for a && b is " + c);
                break;

            case "||":
                c = a || b;
                System.out.println("Ans for a || b is " + c);
                break;

            case "!":
                c = !a;
                System.out.println("Ans for !a is " + c);
                c = !b;
                System.out.println("Ans for !b is " + c);
                break;

            default:
                System.out.println("Enter a valid choice");
                break;
        }

       
    }
}

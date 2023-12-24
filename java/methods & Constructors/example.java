//Example program for class and object 

import java.util.*;

class example {
    
    Scanner sc = new Scanner(System.in);
    int a = 10;
    int b;
    String name;

    public static void main(String[] args) {
        example e = new example();//object(e) declaration  
        
        System.out.println("Enter value of b:");
        e.b = e.sc.nextInt();

        System.out.println("Value of a is: " + e.a);
        System.out.println("Value of b is: " + e.b);

        System.out.println("Enter name:");
        e.name = e.sc.next();
        
        System.out.println("Name is: " + e.name);
    }
}

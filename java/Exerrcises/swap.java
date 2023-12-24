import java.util.*;

class swap{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Enter value of a : ");
		a=sc.nextInt();
		System.out.println("Enter value of b : ");
		b=sc.nextInt();
		
		System.out.println("Value of a and b before swappig is : a= " +a + " b= " +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Value after Swapping is : a= " +a + " b= " +b);
	}
}
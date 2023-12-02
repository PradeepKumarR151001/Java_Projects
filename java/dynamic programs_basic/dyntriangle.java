import java.util.*;
class dyntriangle{
	public static void main(String[] args){
		int t,b,h;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the breadth : ");
		b=sc.nextInt();
		System.out.println("Enter the height : ");
		h=sc.nextInt();
		t=(b*h)/2;
		System.out.println("Area of triangle is : "+t);
	}
}
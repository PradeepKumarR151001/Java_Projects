import java.util.*;
class dynrhombus{
	public static void main(String[] args){
		int p,q,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of one side :");
		p=sc.nextInt();
		System.out.println("Enter value of another side :");
		q=sc.nextInt();
		r=(p*q)/2;
		System.out.println("Area of Rhombus is : "+r);
	}
}